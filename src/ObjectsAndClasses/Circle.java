package ObjectsAndClasses;

public class Circle {
    // private double radius = 1.0;
    private double radius;
    private final double PI = 3.14159;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public void setRadius(double r) {
        if (r <= 0) {
            return;
        }

        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea() {
        return (radius * radius * PI);
    }

    public double findCircumference() {
        return (radius * 2 * PI);
    }

    public static void main(String[] args) {
        Circle c1;
        c1 = new Circle(3.5);
        Circle c2 = new Circle();

        System.out.println("Circle 1 radius: " + c1.getRadius() + ", location: " + c1);
        System.out.println("Circle 2 radius: " + c2.getRadius() + ", location: " + c2);

        c2 = c1;

        System.out.println("*******************");
        System.out.println("Circle 1 radius: " + c1.getRadius() + ", location: " + c1);
        System.out.println("Circle 2 radius: " + c2.getRadius() + ", location: " + c2);
    }
}
