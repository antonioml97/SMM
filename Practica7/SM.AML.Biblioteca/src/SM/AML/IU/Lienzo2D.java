/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SM.AML.IU;

import SM.AML.Graficos.Elipse2D;
import SM.AML.Graficos.Linea2D;
import static SM.AML.IU.Formas.Linea;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author antonioML
 */

public class Lienzo2D extends javax.swing.JPanel { 
    private Rectangle rectangulo;
    private Rectangle rectanguloAux;
    private Linea2D linea;
    private Point pInicial,pFinal;
    private Elipse2D elipse;
    private Shape figuraActual;
    Formas forma;
    Color color;
    private Integer grosor=1;
    boolean relleno,alisar,editar,transparencia;
    List<Shape> vShape = new ArrayList();
    private BasicStroke stroke;
    
    /**
     * Creates new form Lienzo2D
     */
    public Lienzo2D() {
        initComponents();
        forma=Formas.Nada;
        color=Color.black;
        relleno=alisar=editar=transparencia=false;
    }
    public Point2D ObtenerPosicion(){
        Point2D punto=MouseInfo.getPointerInfo().getLocation();
        return punto;
    }
    
    public Color getColor(){
        return color;
    }
    public Formas getForma() {
        return forma;
    }

    public Integer getGrosor() {
        return grosor;
    }

    public boolean getRelleno() {
        return relleno;
    }

    public boolean getAlisar() {
        return alisar;
    }

    public boolean getEditar() {
        return editar;
    }

    public boolean getTransparencia() {
        return transparencia;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    public void setGrosor(int grosor){
        this.grosor = grosor;
    }
    
    
    private void setAtributos(Graphics2D g2d){
        //Asginar color
        Paint color_relleno;
        color_relleno = color;
        g2d.setPaint(color_relleno);
        
        
        //Grososr
        stroke = new BasicStroke((float) grosor);
        g2d.setStroke(stroke);
        //Demás atributos
        if(alisar){
            RenderingHints render;
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                                        RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHints(render);
        }
        else if(transparencia){
            Composite comp;
            comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
            g2d.setComposite(comp);
        }
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
       
        Graphics2D g2d = (Graphics2D)g;
        this.setAtributos(g2d);
        for(Shape s:vShape) {
            if(relleno) 
                g2d.fill(s);
            else 
                g2d.draw(s);
        }
 
    }
    
    public void setForma(Formas forma_nueva){
        forma=forma_nueva;
    }
    public void setRelleno(boolean estado){
        relleno=estado;
    }
     public void setAlisar(boolean estado){
        alisar=estado;
    }
     public void setEditar(boolean estado){
        editar=estado;
    }
     public void setTranparencia(boolean estado){
        transparencia=estado;
    }
     
    private void createShape(){
        switch(forma){
            case Punto:
                Linea2D punto = new Linea2D(pInicial, pInicial);
                figuraActual=(Shape) punto;
                vShape.add(punto);
                break;
            case Linea:
                Linea2D linea = new Linea2D();
                figuraActual=linea;
                vShape.add(linea);
                break;
            case Rectangulo:
                Rectangle rectangulo =  new Rectangle();     
                figuraActual=rectangulo;
                vShape.add(rectangulo);
                break;
            
            case Elipse:
                Elipse2D elipse=  new Elipse2D();   
                figuraActual=elipse;
                vShape.add(elipse);   
                break;
        }
    }
    private void updateShape(){
        if(editar){
           CambioUbicacíon();
        }
        else{
            switch(forma){
                case Linea:
                        Linea2D linea_up=(Linea2D) figuraActual;
                        linea.setLine(pInicial, pFinal);
                        break;
                case Rectangulo:
                        Rectangle rectangulo_up = (Rectangle) figuraActual;
                        rectangulo_up.setFrameFromDiagonal(pInicial, pFinal); 

                        break;
                case Elipse:
                    Elipse2D elipse_up = (Elipse2D) figuraActual;
                    elipse_up.setFrameFromDiagonal(pInicial, pFinal);
                    break;
            }
        }
    }
 
     private void CambioUbicacíon() {
        Point aux = new Point();
               
        if(figuraActual != null){
            if(figuraActual instanceof Linea2D ){ //Tambien se podria haber pueto figuraActua==linea
                System.out.print("Prueba EO EO EO\t: ");
                Linea2D lin = (Linea2D) figuraActual;

                Point2D p1 = lin.getP1();
                Point2D p2 = lin.getP2();
                double dx, dy;

                if(p1.getX() < p2.getX())
                    dx = (p1.getX() - p2.getX()) / 2;          
                else
                    dx = -(p2.getX() - p1.getX()) / 2;

                if(p1.getY() < p2.getY())
                    dy = (p1.getY() - p2.getY()) / 2;          
                else
                    dy = -(p2.getY() - p1.getY()) / 2;


                aux.setLocation(pFinal.getX() + dx, pFinal.getY() + dy);

                lin.setLocation(pFinal);

            }
            else if(figuraActual instanceof Rectangle){
                System.out.print("Prueba 2\t: ");
                Rectangle rect = (Rectangle) figuraActual;

                aux.setLocation(pFinal.getX() - (rect.getWidth()/2), pFinal.getY() - (rect.getHeight()/2));

                rect.setLocation((Point) aux);

            }
            else if(figuraActual instanceof Elipse2D){
                Elipse2D elip = (Elipse2D) figuraActual;
                //Obtengo punto de partida (ya movido)
                aux.setLocation(pFinal.getX() - (elip.getWidth()/2), pFinal.getY() - (elip.getHeight()/2));
                //La muevo
                elip.setLocation(aux);
                
            }
        }
    }

    
    private Shape getSelectedShape(Point2D p){
        for(Shape s:vShape)
            if(s.contains(p)) 
                return s;
        
        return null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       pInicial = evt.getPoint();
       if(editar){
            figuraActual = getSelectedShape(pInicial);
            if(figuraActual != null)
                super.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.MOVE_CURSOR));
        }
        else
       {
            super.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
            this.createShape();
       }
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        pFinal = evt.getPoint();
        this.updateShape();
        this.repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        pFinal = evt.getPoint();
        this.updateShape();
      
        this.repaint();
          
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}
