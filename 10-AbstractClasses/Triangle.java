import java.lang.Math;
public class Triangle extends Shape  {
    double a;
    double b;
    double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double printArea(){
        double p=a+b+c;
        p=p/2;
        double area= p*(p-a)*(p-b)*(p-c);
        area= Math.sqrt(area);
        
        return area;




    }
    public double printPerimeter(){


        return(a+b+c);
    }
    

    
}
