package Basics;

public class First {

    private String name;

    public First() {
        name = "Andrew";
    }

    public First(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        First myVariable = new First();
        myVariable.greetings();
        First myOtherVariable = new First("Alice");
        myOtherVariable.greetings();
    }

    private void greetings() {
        System.out.println("Hello, " + this.name);
    }
}
