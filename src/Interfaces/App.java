package Interfaces;

public class App {
    public static MakesSounds whoIsLouder(MakesSounds obj1, MakesSounds obj2) {
        if (obj1.howLoud() > obj2.howLoud()) {
            return obj1;
        } else {
            return obj2;
        }
    }

    public static void printWinner(MakesSounds noise) {
        if (noise instanceof Car) {
            Car c1 = (Car) noise;
            System.out.println("A " + c1.getMake() + " " + c1.getModel() + " is louder");
        } else if (noise instanceof Duck) {
            Duck d1 = (Duck) noise;
            System.out.println("A " + d1.getSpecies() + " is louder");
        }
    }

    public static void main(String[] args) {
        Duck d1 = new Duck("Mallard", 4);
        Duck d2 = new Duck("Wood Duck", 3);
        Car c1 = new Car("Ford", "F150", 10);
        Car c2 = new Car("Toyota", "Prius", 2);

        MakesSounds result1 = whoIsLouder(c1, c2);
        MakesSounds result2 = whoIsLouder(d1, d2);
        MakesSounds result3 = whoIsLouder(d1, c1);
        MakesSounds result4 = whoIsLouder(c2, d2);

        printWinner(result1);
        printWinner(result2);
        printWinner(result3);
        printWinner(result4);

    }
}
