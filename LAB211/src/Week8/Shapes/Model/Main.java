package Week8.Shapes.Model;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];


        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(4.0);
        shapes[2] = new Triangle(3.0, 6.0);
        shapes[3] = new Sphere(3.0);
        shapes[4] = new Cube(4.0);
        shapes[5] = new Tetrahedron(6.0);


        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape);

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.printf("Area: \n", twoDShape.getArea());

            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.printf("Area: \n", threeDShape.getArea());
                System.out.printf("Volume: \n", threeDShape.getVolume());
            }

            System.out.println();
        }
    }
}
