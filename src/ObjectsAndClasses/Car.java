package ObjectsAndClasses;

/**
 * A class to represent automobiles
 * 
 * @author William Goble
 */
public class Car {
    private String make;
    private String model;
    private String color;
    private int wheels = 4;
    private int doors = 4;

    /*
    * Constructor for objects of the class Car.
    * What is the default car?
    */
    public Car() {
        make = "Ford";
        model = "F150";
        color = "Blue Jean";
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String mod) {
        model = mod;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addWheel() {
        wheels = wheels + 1;
    }

    public void removeWheel() {
        wheels = wheels - 1;
    }

    public void addDoor() {
        doors += 1;
    }

    public void removeDoor() {
        doors -= 1;
    }

    /**
     * display all information about the Car
     */
    public void print() {
        System.out.println("A " + color +  " " + make + " " + model + ".");
    }    

    /**
     * return the make of the Car
     * @return the make of the Car
     */
    public String getMake() { 
        return make;
    }
  
    /**
     * return the model of the Car
     * @return the model of the Car
     */
    public String getModel() { 
        return model;
    }
  
    /**
     * return the color of the Car
     * @return the color of the Car
     */
    public String getColor() { 
        return color;
    }

    /**
     * return the number of wheels of the Car
     * @return the number of wheels of the Car
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * return the number of doors of the Car
     * @return the number of doors of the Car
     */
    public int getDoors() {
        return doors;
    }
    
    /**
     * return whether or not two Cars are the same
     * @return whether or not two Cars are the same
     */
    public boolean equals(Car anotherCar) { 
        return make.equals(anotherCar.make) && model.equals(anotherCar.model)
               && color.equals(anotherCar.color);
    }
}
