package Inheritance.OverridingExample;

public class App {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("Paul", 6);
        Ranged r1 = new Ranged("Ann", "Fire", 10);
        Melee m1 = new Melee("George", "Blunt Force", 20);

        m1.attack();
        r1.attack();
        w1.attack();
    }
}
