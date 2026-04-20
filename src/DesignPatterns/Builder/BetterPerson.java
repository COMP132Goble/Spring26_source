package DesignPatterns.Builder;

public class BetterPerson {
    private String name;
    private int age;
    private String favoriteColor;
    private String birthCity;
    private String currentCity;
    private float numberLimbs;
    
    private BetterPerson(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.favoriteColor = builder.favoriteColor;
        this.birthCity = builder.birthCity;
        this.currentCity = builder.currentCity;
        this.numberLimbs = builder.numberLimbs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return favoriteColor;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public float getLimbs() {
        return numberLimbs;
    }

    public static class Builder {
        private String name;
        private int age;
        private String favoriteColor;
        private String birthCity;
        private String currentCity;
        private float numberLimbs;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFavoriteColor(String color) {
            this.favoriteColor = color;
            return this;
        }

        public Builder setBirthCity(String birthCity) {
            this.birthCity = birthCity;
            return this;
        }

        public Builder setCurrentCity(String currentCity) {
            this.currentCity = currentCity;
            return this;
        }

        public Builder setNumberLimbs(float limbs) {
            this.numberLimbs = limbs;
            return this;
        }

        public BetterPerson build() {
            return new BetterPerson(this);
        }
    }
}
