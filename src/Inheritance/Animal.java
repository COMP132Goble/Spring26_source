package Inheritance;

public class Animal {
    private String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    public void noise() {
        System.out.println(sound);
    }

}
