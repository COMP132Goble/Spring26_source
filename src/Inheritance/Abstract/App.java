package Inheritance.Abstract;

public class App {
    public static void main(String[] args) {
        Animal bob = new Dog("Bob", 12, "Lab");
        Dog anne = new Dog("Anne", 5, "Pitbull");

        System.out.println(bob.makeNoise());
        System.out.println(anne.makeNoise());
    }
}
