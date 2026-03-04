package Inheritance;

public class Pet extends Animal{
    private String name;

    public Pet(String sound, String name) {
        super(sound);
        this.name = name;
    }

    public void speak() {
        super.noise();
    }

    public static void main(String[] args) {
        Pet zuko = new Pet("woof woof", "zuko");
    }
}
