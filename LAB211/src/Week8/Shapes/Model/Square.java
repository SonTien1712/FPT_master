package Week8.Shapes.Model;

class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + " [side=" + side + "]";
    }
}
