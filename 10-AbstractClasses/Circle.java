import java.lang.Math;
public class Circle extends Shape {
    double r;
    
    public Circle(double r) {
        this.r = r;
    }

    public double printArea(){
        double area= Math.PI*r*r;
        return area;
       }
       public double printPerimeter(){


        return(2*Math.PI*r);
    }
    

    
}
