package Interfaces;

public class MyTriangle implements MyMath {
    private int base;
    private int height;

    public MyTriangle() {
        base = 10;
        height = 15;
    }

    public double area() {
        return 0.5 * base * height;
    }    
}
