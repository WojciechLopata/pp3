public class Rectangle extends Shape {
    double a;
    double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double printArea(){
        return (a*b);
    }
    public double printPerimeter(){


        return((2*a)+(2*b));
    }
    

    
    
}
