// Shape.java
public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double perimeter();

    public abstract double area();

    @Override
    public String toString() {
        return "Name: " + name + ", Area: " + area() + ", Perimeter: " + perimeter();
    }
}