// Ellipse.java
public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double a, double b) {
        super(name);
        majorAxis = Math.max(a, b);
        minorAxis = Math.min(a, b);
    }

    @Override
    public double perimeter() {
        return Math.PI * (2 * (majorAxis + minorAxis) - Math.sqrt((2 * majorAxis * minorAxis)));
    }

    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
}