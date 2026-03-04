package Exam1;

import java.util.ArrayList;

public class FruitBasket {
    private ArrayList<Fruit> assortedFruit;

    public FruitBasket() {
        assortedFruit = new ArrayList<Fruit>();
    }

    public int getNumFruits() {
        return assortedFruit.size();
    }

    public void addFruit(Fruit fruit) {
        assortedFruit.add(fruit);
    }

    public Fruit remove(int index) {
        if (index >= 0 && index < assortedFruit.size()) {
            return assortedFruit.remove(index);
        } else {
            System.out.println("Invalid index...");
        }
        return null;
    }

    public FruitBasket getExoticFruits() {
        FruitBasket temp = new FruitBasket();
        for (int i = 0; i < assortedFruit.size(); i++) {
            Fruit fruit = assortedFruit.get(i);
            if (fruit.getType().equals("exotic")) {
                temp.addFruit(fruit);
            }
        }
        return temp;
    }

    public double getTotalWeight() {
        double answer = 0;
        for (int i = 0; i < assortedFruit.size(); i++) {
            Fruit fruit = assortedFruit.get(i);
            answer += fruit.getWeight();
        }
        return answer;
    }
}
