package Interfaces;

public class App {
    public static MakesSounds whoIsLouder(MakesSounds obj1, MakesSounds obj2) {
        if (obj1.howLoud() > obj2.howLoud()) {
            return obj1;
        } else {
            return obj2;
        }
    }

    public static void main(String[] args) {
        Duck d1 = new Duck();
        Duck d2 = new Duck();
        Car c1 = new Car();
        Car c2 = new Car();

        MakesSounds obj = App.whoIsLouder(d1, c2);
        System.out.println(obj);
    }
}
