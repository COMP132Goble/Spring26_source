package Inheritance.OverridingExample;

public class Melee extends Weapon {
    private String attackType;
    
    public Melee(String name, String attackType, int dice) {
        super(name, dice);
        this.attackType = attackType;
    }

    @Override
    public int attack() {
        int attack = super.attack();
        System.out.println("Dealing " + attack + " points of " + attackType + " damage");
        return attack;
    }
}
