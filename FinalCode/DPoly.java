import java.awt.Color;
import java.awt.Polygon;

//DOES NOTHING CURRENTLY
public class DPoly {
   Color c;
   double[] x, y, z;
   int poly = 0;
   
   //assigns varibles to DPoly
   public DPoly(int[] x, int[] y, int[] z, Color c){
      this.c = c;
      this.x = x;
      this.y = y;
      this.z = z;
   }
   
   //change polygon
   void updatePolygon() {
      double[] newX = new double[x.length];
      double[] newY = new double[x.length];
      Interface4.DrawablePolygons[poly] = new PolygonObject(newX, newY, c);
   }
}