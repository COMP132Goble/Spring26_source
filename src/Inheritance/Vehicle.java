package Inheritance;

public class Vehicle {
    private String make;

    public Vehicle() {
        make = "Ford";
    }

    public Vehicle(String make) {
        this.make = make;
    }

    public void honk() {
        System.out.println("Honk Honk");
    }

    public String getMake() {
        return make;
    }
}
