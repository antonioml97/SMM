/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import practica4.Lienzo.Forma;

/**
 *
 * @author anton
 */
public class VistaPrincipal extends javax.swing.JFrame {
   
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        
        this.setSize(400,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoForma = new javax.swing.ButtonGroup();
        ColorElegido = new javax.swing.ButtonGroup();
        BarraHeramientas = new javax.swing.JToolBar();
        Punto = new javax.swing.JToggleButton();
        Linea = new javax.swing.JToggleButton();
        Rectangulo = new javax.swing.JToggleButton();
        Ovalo = new javax.swing.JToggleButton();
        lienzo = new practica4.Lienzo();
        PanelInferior = new javax.swing.JPanel();
        Colores = new javax.swing.JPanel();
        botonNegro = new javax.swing.JButton();
        botonRojo = new javax.swing.JButton();
        botonAzul = new javax.swing.JButton();
        botonBlanco = new javax.swing.JButton();
        botonAmarillo = new javax.swing.JButton();
        botonVerde = new javax.swing.JButton();
        BarraEstado = new javax.swing.JPanel();
        HerramientaSeleccionada = new javax.swing.JLabel();
        PanelRelleno = new javax.swing.JPanel();
        BotonRelleno = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        VerBarraEstado = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint Basico");
        setBackground(new java.awt.Color(255, 255, 255));

        BarraHeramientas.setRollover(true);

        tipoForma.add(Punto);
        Punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        Punto.setFocusable(false);
        Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Punto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoMarcado(evt);
            }
        });
        BarraHeramientas.add(Punto);

        tipoForma.add(Linea);
        Linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        Linea.setFocusable(false);
        Linea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Linea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaMarcado(evt);
            }
        });
        BarraHeramientas.add(Linea);

        tipoForma.add(Rectangulo);
        Rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        Rectangulo.setFocusable(false);
        Rectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecatanguloMarcado(evt);
            }
        });
        BarraHeramientas.add(Rectangulo);

        tipoForma.add(Ovalo);
        Ovalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        Ovalo.setFocusable(false);
        Ovalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ovalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Ovalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvaloMarcado(evt);
            }
        });
        BarraHeramientas.add(Ovalo);

        getContentPane().add(BarraHeramientas, java.awt.BorderLayout.PAGE_START);

        lienzo.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo, java.awt.BorderLayout.CENTER);

        PanelInferior.setLayout(new java.awt.BorderLayout());

        Colores.setPreferredSize(new java.awt.Dimension(100, 50));
        Colores.setLayout(new java.awt.GridLayout(2, 0));

        botonNegro.setBackground(java.awt.Color.black);
        botonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroActivado(evt);
            }
        });
        Colores.add(botonNegro);

        botonRojo.setBackground(java.awt.Color.red);
        botonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActivado(evt);
            }
        });
        Colores.add(botonRojo);

        botonAzul.setBackground(java.awt.Color.blue);
        botonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActivado(evt);
            }
        });
        Colores.add(botonAzul);

        botonBlanco.setBackground(java.awt.Color.white);
        botonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blancoActivado(evt);
            }
        });
        Colores.add(botonBlanco);

        botonAmarillo.setBackground(java.awt.Color.yellow);
        botonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloActivado(evt);
            }
        });
        Colores.add(botonAmarillo);

        botonVerde.setBackground(java.awt.Color.green);
        botonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerdeActionPerformed(evt);
            }
        });
        Colores.add(botonVerde);

        PanelInferior.add(Colores, java.awt.BorderLayout.LINE_START);

        BarraEstado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BarraEstado.setPreferredSize(new java.awt.Dimension(429, 21));
        BarraEstado.setLayout(new java.awt.BorderLayout());

        HerramientaSeleccionada.setText("Barra de estado");
        BarraEstado.add(HerramientaSeleccionada, java.awt.BorderLayout.LINE_START);

        PanelInferior.add(BarraEstado, java.awt.BorderLayout.PAGE_END);

        PanelRelleno.setLayout(new java.awt.BorderLayout());

        BotonRelleno.setText("Relleno");
        BotonRelleno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRellenoMouseClicked(evt);
            }
        });
        BotonRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRellenoActionPerformed(evt);
            }
        });
        PanelRelleno.add(BotonRelleno, java.awt.BorderLayout.LINE_END);

        PanelInferior.add(PanelRelleno, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Archivo");
        jMenu1.setAutoscrolls(true);

        Nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoNuevo(evt);
            }
        });
        jMenu1.add(Nuevo);

        Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoAbrir(evt);
            }
        });
        jMenu1.add(Abrir);

        Guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarArchivo(evt);
            }
        });
        jMenu1.add(Guardar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        VerBarraEstado.setSelected(true);
        VerBarraEstado.setText("Ver barra de estado");
        VerBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBarraEstado(evt);
            }
        });
        jMenu2.add(VerBarraEstado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoAbrir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoAbrir
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_ArchivoAbrir

    private void OvaloMarcado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvaloMarcado
        HerramientaSeleccionada.setText("Elipse");
        lienzo.setForma(Forma.Elipse);
    }//GEN-LAST:event_OvaloMarcado

    private void RecatanguloMarcado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecatanguloMarcado
        HerramientaSeleccionada.setText("Rectangulo");
        lienzo.setForma(Forma.Rectangulo);
    }//GEN-LAST:event_RecatanguloMarcado

    private void LineaMarcado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaMarcado
        HerramientaSeleccionada.setText("Linea");
        lienzo.setForma(Forma.Linea);
    }//GEN-LAST:event_LineaMarcado

    private void PuntoMarcado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoMarcado
        HerramientaSeleccionada.setText("Punto");
        lienzo.setForma(Forma.Punto);
    }//GEN-LAST:event_PuntoMarcado

    private void NegroActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroActivado
         lienzo.setColor(Color.black);
    }//GEN-LAST:event_NegroActivado

    private void rojoActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActivado
        lienzo.setColor(Color.red);
    }//GEN-LAST:event_rojoActivado

    private void azulActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActivado
         lienzo.setColor(Color.blue);
    }//GEN-LAST:event_azulActivado

    private void blancoActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blancoActivado
         lienzo.setColor(Color.white);
    }//GEN-LAST:event_blancoActivado

    private void amarilloActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloActivado
         lienzo.setColor(Color.yellow);
    }//GEN-LAST:event_amarilloActivado

    private void botonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerdeActionPerformed
         lienzo.setColor(Color.green);
    }//GEN-LAST:event_botonVerdeActionPerformed

    private void BotonRellenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRellenoMouseClicked

    }//GEN-LAST:event_BotonRellenoMouseClicked

    private void BotonRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRellenoActionPerformed
        if(BotonRelleno.isSelected())
            lienzo.setRelleno(true);
        else
            lienzo.setRelleno(false);
    }//GEN-LAST:event_BotonRellenoActionPerformed

    private void ArchivoNuevo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoNuevo
        lienzo.limpiar();
    }//GEN-LAST:event_ArchivoNuevo

    private void BotonBarraEstado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBarraEstado
      boolean verBarra = VerBarraEstado.isSelected();
      BarraEstado.setVisible(verBarra);
    }//GEN-LAST:event_BotonBarraEstado

    private void GuardarArchivo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarArchivo
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_GuardarArchivo

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JPanel BarraEstado;
    private javax.swing.JToolBar BarraHeramientas;
    private javax.swing.JCheckBox BotonRelleno;
    private javax.swing.ButtonGroup ColorElegido;
    private javax.swing.JPanel Colores;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JLabel HerramientaSeleccionada;
    private javax.swing.JToggleButton Linea;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JToggleButton Ovalo;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelRelleno;
    private javax.swing.JToggleButton Punto;
    private javax.swing.JToggleButton Rectangulo;
    private javax.swing.JCheckBoxMenuItem VerBarraEstado;
    private javax.swing.JButton botonAmarillo;
    private javax.swing.JButton botonAzul;
    private javax.swing.JButton botonBlanco;
    private javax.swing.JButton botonNegro;
    private javax.swing.JButton botonRojo;
    private javax.swing.JButton botonVerde;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private practica4.Lienzo lienzo;
    private javax.swing.ButtonGroup tipoForma;
    // End of variables declaration//GEN-END:variables
}
