// Demo.java
public class Demo {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(3, 4, 1, 1);
        System.out.println("Original Point: " + point);
        point.move();
        System.out.println("After moving: " + point);
    }
}