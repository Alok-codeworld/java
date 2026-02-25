package Abstraction;

public class main {
    
    public static void main(String[] args) {
        
        Rectrangle r= new Rectrangle(4, 5);
        r.area();

        System.out.println("Area of Rectangle is : " + r.area());
        System.out.println("Perimeter of Rectangle is : " + r.perimeter());

        Circle c = new Circle(4);
        System.out.println("Area of Rectangle is : " + c.area());
        System.out.println("Perimeter of Rectangle is : " + c.perimeter());
    }
}
