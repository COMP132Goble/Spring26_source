package DesignPatterns.Builder;

public class CrazyPerson {
    private String name;
    private int age;
    private String favoriteColor;
    private String birthCity;
    private String currentCity;
    private float numberLimbs;
    
    public CrazyPerson(String name, int age, String color, String birth, String current) {
        this.name = name;
        this.age = age;
        this.favoriteColor = color;
        this.birthCity = birth;
        this.currentCity = current;
        this.numberLimbs = 2f;
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
}
