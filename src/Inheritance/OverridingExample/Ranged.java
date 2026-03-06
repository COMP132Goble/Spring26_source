package Inheritance.OverridingExample;

public class Ranged extends Weapon {
    private int ammo;
    private String attackType;

    public Ranged(String name, String attackType, int dice) {
        super(name, dice);
        this.attackType = attackType;
        this.ammo = 20;
    }

    @Override
    public int attack() {
        ammo = ammo - 1;
        int damage = super.attack();
        System.out.println("Fires weapon and deals " + damage + " points of" + attackType + "damage");
        return damage;
    }

    public void addAmmo(int amount) {
        ammo += amount;
    }
}
