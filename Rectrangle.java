package Abstraction;

class Rectrangle extends Shape{

double length;
double width;

    
public Rectrangle(double length , double width) {
    this.length=length;
    this.width=width;
}
    

    double area(){
        return length*width;
    }

    double perimeter(){
        return 2*(length + width);
    }
    

}
