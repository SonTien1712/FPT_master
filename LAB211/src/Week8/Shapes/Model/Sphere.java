package Week8.Shapes.Model;

class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius; // 4πr²
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius; // (4/3)πr³
    }

    @Override
    public String toString() {
        return super.toString() + " [radius=" + radius + "]";
    }
}

