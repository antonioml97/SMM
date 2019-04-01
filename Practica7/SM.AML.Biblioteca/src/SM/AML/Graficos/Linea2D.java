/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SM.AML.Graficos;

import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author antonioML
 */
public class Linea2D extends Line2D.Float {
    public Linea2D(Point p1, Point p2) {
        this.setLine(p1, p2);
    }
    public Linea2D(){
    
    }
    public void setLocation(Point2D pos){ 
        double dx=pos.getX()-this.getX1();
        double dy=pos.getY()-this.getY1();
        
        Point2D p_movido = new Point2D.Double(this.getX2()+dx , this.getY2()+dy); 
        
        //Muevo la linea
        this.setLine(pos,  p_movido );
    }
    
}
