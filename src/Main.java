public class Main {


    public static void  main (String [] args){
        Circle circles = new Circle(5);
        System.out.println("Circle: " + " Area: " + circles.getArea() + " Perimeter: " + circles.getPerimeter() + " Radius: " + circles.getRadius());


        Triangle triangles = new Triangle(5,5);
        System.out.println("Triangle: " + " Area: " + triangles.getAreaTriangle() + " Perimeter: " + triangles.getPerimeterTriangle()
                + " Side: " + triangles.getSide() + " Height: " + triangles.getHeight());

        Piramid pyramid = new Piramid(2,5);
        System.out.println("Pyramid: " + " Volume " + pyramid.getVolume());
    }

}
