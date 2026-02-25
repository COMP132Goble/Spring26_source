package Inheritance;

public class Car extends Vehicle {
    private String model;

    public Car() {
        super();
        model = "F150";
    }

    public Car(String model) {
        super();
        model = this.model;
    }

    public Car(String make, String model) {
        super(make);
        this.model = model;
    }

    public void getDetails() {
        System.out.print("I drive a " + super.getMake() + " "  + this.model + " and it goes ");
        super.honk();
    }

    public static void main(String[] args) {
        Car truck = new Car();
        truck.getDetails();
    }
}
