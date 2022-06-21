import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//Polygon Object
//Assigns data about created polygon
public class PolygonObject {
   Polygon p;
   Color c;
   
   //create new polygon
   //everthing else doesn't work
   public PolygonObject(double[] x, double[] y, Color c){
      p = new Polygon();
      for (int i = 0; i < x.length; i++){
         p.addPoint((int)x[i], (int)y[i]);
      }
      this.c = c;
   }
   
   //draw the polygon 
   void drawPolygon(Graphics g){
      g.setColor(c);
      g.drawPolygon(p);
   }
}