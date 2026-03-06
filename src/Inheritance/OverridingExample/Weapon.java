package Inheritance.OverridingExample;

import java.util.Random;

public class Weapon {
    private String name;
    private int dice;

    public Weapon(String name, int die) {
        this.name = name;
        this.dice = die;
    }

    public String getName() {
        return name;
    }

    public int attack() {
        Random number = new Random();
        int attack = number.nextInt(dice) + 1;
        return attack;
    }
}
