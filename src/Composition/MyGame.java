package Composition;
import Composition.Game.Goblin;
import Composition.Game.Monster;
import Composition.Game.Player;

public class MyGame {
    public static void main(String[] args) {
        Player player1 = new Player("Frodo");
        Monster rat = new Monster();
        Goblin goblin1 = new Goblin("Paul");
        Goblin goblin2 = new Goblin("George");
        Goblin goblin3 = new Goblin("John");
        Goblin goblin4 = new Goblin("Ringo");

        player1.show();
        double ratAttack = rat.smallAttack();
        double paulAttack = goblin1.attack();
        double georgeAttack = goblin2.attack();
        double johnAttack = goblin3.attack();
        double ringoAttack = goblin4.attack();

        player1.takeDameage(ratAttack);
        player1.takeDameage(paulAttack);
        player1.takeDameage(georgeAttack);
        player1.takeDameage(johnAttack);
        player1.takeDameage(ringoAttack);

        player1.show();
    }
}
