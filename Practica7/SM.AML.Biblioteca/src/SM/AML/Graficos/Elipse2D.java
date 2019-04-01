/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SM.AML.Graficos;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 *
 * @author antonioML
 */
public class Elipse2D extends Ellipse2D.Float {
    public void setLocation(Point2D pos){
        double dx=pos.getX()-this.getMinX();
        double dy=pos.getY()-this.getMinY();

        Point2D p_movido = new Point2D.Double(this.getMaxX()+dx,this.getMaxY()+dy);
        
        //Muevo la elipse
        this.setFrameFromDiagonal(pos, p_movido);
    }   
}

