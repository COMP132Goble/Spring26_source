package Composition;

public class Car {
    private static int numWheels = 4;
    public static int mirrorNumber = 3;
    public static int numSteeringWheel = 1;
    public static Transmission transmission = null;

    private String color;
    private int numDoors;
    private int numSeats;

    public static int getNumWheels() {
        return numWheels;
    }
}
