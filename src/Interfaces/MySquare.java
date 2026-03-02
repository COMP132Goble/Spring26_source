package Interfaces;

public class MySquare implements MyMath {
    private int side;

    public MySquare() {
        side = 10;
    }

    public double area() {
        return side*side;
    }
}
