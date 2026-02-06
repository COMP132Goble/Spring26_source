package Composition.Game;

import java.util.Random;

public class Goblin {
    private double health;
    private String name;
    private static int numGoblins = 0;

    public Goblin(String name) {
        this.name = name;
        health = 100;
        numGoblins++;
    }

    public double attack() {
        Random rand = new Random();
        double minValue, maxValue;

        if (numGoblins < 5) {
            minValue = 0.0;
            maxValue = 0.0;
        } else {
            minValue = 10.0;
            maxValue = 20.0;
        }
        double attackValue = minValue + (maxValue - minValue) * rand.nextDouble();
        return attackValue;
    }

    public void takeDamage(double damage) {
        health = health - damage;
    }

    public String toString() {
        return String.format("Goblin %s is at %.2f% health\n", name, health);
    }
}
