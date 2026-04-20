package DesignPatterns.Builder;

public class App {
    public static void main(String[] args) {
        CrazyPerson personA = new CrazyPerson(
            "Bob George",
            10000, 
            "Blue",
            "Over There",
            "Here"
        );
        
        BetterPerson personB = new BetterPerson.Builder()
                .setName("Paul")
                .setAge(999)
                .setFavoriteColor("Red")
                .setBirthCity("Parts Unknown")
                .setCurrentCity("Carlisle")
                .build();
    }
}
