package Exam1;

public class Fruit {
    private String name;
    private String color;
    private String type;
    private double weight;

    public Fruit(String name, String color, String type, double weight) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
}
