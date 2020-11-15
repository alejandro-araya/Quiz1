import java.lang.Math;


public class Circle {

    //Attributes
    private double radius;
    private double pi = Math.PI;

    //Constructor
    public Circle (double radius){
        this.radius = radius;
    }


    public double getArea(){
        return pi*this.radius;
    }

    public double getPerimeter() {
        return 2*(pi*this.radius);
    }

    public double getRadius() {
        return this.radius;
    }
}
