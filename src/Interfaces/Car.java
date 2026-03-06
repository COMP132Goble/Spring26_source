package Interfaces;

public class Car implements MakesSounds {
    private String make;
    private String model;
    private int noise;

    public Car(String make, String model, int noise) {
        this.make = make;
        this.model = model;
        this.noise = noise;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void makeSound() {
        System.out.println("Vroom Vroom");
    }

    public int howLoud() {
        return noise;
    }
}
