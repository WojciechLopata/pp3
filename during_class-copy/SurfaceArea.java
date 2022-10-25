
/**
 * Write a description of class SurfaceArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SurfaceArea
{
  public static double triangle(float base,float height)
  {
      float area=  base*height/2;
      return area;
  }
  
  public static double circle(double radius){
      double area=3.1415f*(radius*radius);
      return area;
  }
  
  public static double rectangle(double length, double height){
        double area=length*height;
        return area;
  }
  
  public static void main(String [] args){
     double areaRectangle=rectangle(4,5);
     double areaCircle=circle(3);
     double areaTriangle=triangle(3,4);
     System.out.println(areaRectangle);
     System.out.println(areaCircle);
     System.out.println(areaTriangle);
     
      
      
     
  }
}
