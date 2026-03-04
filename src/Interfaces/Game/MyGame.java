package Interfaces.Game;

public class MyGame {
    public static void main(String[] args) {
        Monster bob = new Monster();
        Player alice = new Player("Alice");

        ????.takeDamage(whoGoesFirst(bob, alice));
    }
    // compare Player vs Monster 
    public static Attack whoGoesFirst(Attack thing1, Attack thing2) {
        if(thing1.smallAttack() > thing2.smallAttack()) {
            return thing1;
        } else {
            return thing2;
        }
    }
}
