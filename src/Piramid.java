import java.lang.Math;



public class Piramid {

    private double height;
    private Triangle triangle;

    public Piramid (double side, double height){
        this.triangle = new Triangle(side,height);
        this.height = height;
    }


    private double getHeight(){
        return getHeight();
    }

    public double getVolume(){
        return (Math.sqrt(3) / 12 ) * triangle.getAreaTriangle() * height;
    }

}
