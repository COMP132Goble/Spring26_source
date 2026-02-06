package Composition.Game;

import java.util.Random;

public class Monster {
    double health;

    public Monster() {
        health = 100.0;
    }

    public double smallAttack() {
        Random r = new Random();
        double minValue = 1.0;
        double maxValue = 6.0;
        double attackValue = minValue + (maxValue - minValue) * r.nextDouble();
        return attackValue;
    }

    public double bigAttack() {
        Random r = new Random();
        double minValue = 1.0;
        double maxValue = 20.0;
        double attackValue = minValue + (maxValue - minValue) * r.nextDouble();
        return attackValue;
    }
}
