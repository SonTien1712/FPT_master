package Week8.Shapes.Model;

class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side; // √3 * a²
    }

    @Override
    public double getVolume() {
        return (1.0/12.0) * Math.sqrt(2) * side * side * side; // (1/12) * √2 * a³
    }

    @Override
    public String toString() {
        return super.toString() + " [side=" + side + "]";
    }
}
