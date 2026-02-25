package Abstraction;

class Circle extends Shape {
    
    double radius;

    Circle(double radius){
        this.radius=radius;
    }
    
    double area(){
        return 3.14*radius*radius;
    }

    double perimeter(){
        return 2* 3.14*radius;
    }
}
