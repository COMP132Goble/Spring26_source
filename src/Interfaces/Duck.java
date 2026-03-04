package Interfaces;

public class Duck implements MakesSounds {
    private String name; 

    public Duck() {
        name = "Paul";
    }

    public String getName() {
        return name;
    }

    public int howLoud() {
        return 8;
    }
}
