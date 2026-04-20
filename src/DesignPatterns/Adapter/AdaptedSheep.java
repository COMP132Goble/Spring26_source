package DesignPatterns.Adapter;

public class AdaptedSheep implements MakesNoise {
    private Sheep shawn;

    public AdaptedSheep(Sheep sheep) {
        this.shawn = sheep;
    }

    @Override
    public int getVolume() {
        return shawn.howLoud();
    }
}
