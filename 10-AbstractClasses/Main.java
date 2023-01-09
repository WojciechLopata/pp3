public class Main {
    public static void main(String[] args){
        Shape a=new Triangle(3, 4, 5);
        System.out.println(a.printArea());
        System.out.println(a.printPerimeter());
        Shape b = new Circle(2);
        System.out.println(b.printArea());
        System.out.println(b.printPerimeter());
        Shape c= new Rectangle(2, 10);
        System.out.println(c.printArea());
        System.out.println(c.printPerimeter());
    }
}
