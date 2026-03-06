package Interfaces;

public class Duck implements MakesSounds{
    private String species;
    private int noise;

    public Duck(String species, int noise) {
        this.species = species;
        this.noise = noise;
    }

    public String getSpecies() {
        return this.species;
    }

    public void makeSound() {
        System.out.println("Quack Quack");
    }

    public int howLoud() {
        return noise;
    }
}
