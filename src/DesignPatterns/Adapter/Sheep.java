package DesignPatterns.Adapter;

public class Sheep implements MakesSound {
    public void produceSound() {
        System.out.println("Baaaaaaaaaaa");
    }

    public int howLoud() {
        return 4;
    }
}
