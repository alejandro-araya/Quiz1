import java.lang.Math;


public class Triangle {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public double getAreaTriangle() {
        return (side * height) / 2;
    }

    public double getPerimeterTriangle(){
     return side + side + side;
    }

}
