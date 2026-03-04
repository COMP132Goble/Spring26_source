package Inheritance;

public class App {
    public static void main(String[] args) {
        Pet dog = new Pet("Bark Bark");
        Wild cow = new Wild("moos");

        dog.speak();
        cow.noise();


        // Student kid1 = new Student("Bob", "1234 Sesame St.", 
        //                         "555-5555", "Dickinson College");
        // kid1.getDetails();
        // kid1.addClass("Intro to thinking");
        // kid1.addClass("Underwater Basket Weaving");
        // kid1.getDetails();

        // Employee adult1 = new Employee("Anna", "1234 Sesame St.", 
        //                             "555-5555", "02/13/2026", "Lead Counter");

        // adult1.getDetails();
    }
}
