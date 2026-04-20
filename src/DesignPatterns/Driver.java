package DesignPatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
    //    firstExample();
       secondExample(); 
    }

    static void firstExample() {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        if (x == y && y == z) {
            System.out.println("These three objects point to the same memory location on the heap.");
            System.out.println("This means they are the same object!");
        } else {
            System.out.println("These objects DO NOT point to the same memory location,");
            System.out.println("Therefore they are not the same object... :(");
        }

        System.out.println("====================");

        x.str = (x.str).toUpperCase();
        System.out.println("Let's see how this impacts all objects");
        System.out.println("From x: " + x.str);
        System.out.println("From y: " + y.str);
        System.out.println("From z: " + z.str);

        System.out.println("====================");
        y.str = (y.str).toLowerCase();
        System.out.println("From x: " + x.str);
        System.out.println("From y: " + y.str);
        System.out.println("From z: " + z.str);
    }

    static void secondExample() {
        SingletonExample log1 = SingletonExample.getLogger();
        SingletonExample log2 = SingletonExample.getLogger();
        Scanner input = new Scanner(System.in);

        Secret game = Secret.getAnswer();

        boolean player1Wins = false;
        boolean player2Wins = false;

        int guess1 = 0;
        int guess2 = 0;

        ArrayList<Integer> player1Guesses = new ArrayList<Integer>();
        ArrayList<Integer> player2Guesses = new ArrayList<Integer>();

        while(!player1Wins && !player2Wins) {
            System.out.println("Player 1: Guess a number ");
            guess1 = input.nextInt();
            player1Guesses.add(guess1);
            // log1.log("Player1 guess: " + guess1);

            if (game.checkAnswer(guess1)) {
                player1Wins = true;
                break;
            }

            System.out.println("Player 2: Guess a number ");
            guess2 = input.nextInt();
            player2Guesses.add(guess2);
            // log2.log("Player2 guess: " + guess2); 

            if (game.checkSecondAnswer(guess2)) {
                player2Wins = true;
                break;
            }

            System.out.println("No one was correct...");
            System.out.println("========================");
        }
        input.close();

        if (player1Wins) {
            System.out.println("Player1 wins!");
        } else if(player2Wins) {
            System.out.println("Player2 wins!");
        }

        log1.log("Player1 Gusses");
        for(int i:player1Guesses) {
            log1.log("" + i);
        }

        log2.log("Player2 Guesses");
        for(int i:player2Guesses) {
            log2.log("" + i);
        }
    }
}
