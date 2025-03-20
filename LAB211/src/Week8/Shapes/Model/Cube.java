package Week8.Shapes.Model;

class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side; // 6a²
    }

    @Override
    public double getVolume() {
        return side * side * side; // a³
    }

    @Override
    public String toString() {
        return super.toString() + " [side=" + side + "]";
    }
}
