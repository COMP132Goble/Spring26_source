package ObjectsAndClasses;

/**
 * This class represents the mathematical concept of a fraction. 
 * Creating this class will allow us to preform some basic fraction 
 * arithmetic.
 * 
 * @author William Goble
 * 
 */
public class Fraction {
    private int numerator = 0;       // numerator (and keeps its sign)
    private int denominator = 1;     // always stays positive, and cannot be zero

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    // or
    // public Fraction() { }

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    // Starter function to ensure that a user can only create a valid 
    // fraction. 
    public boolean set(int n, int d) {
        if(d > 0) {
            numerator = n;
            denominator = d;
            return true;
        } else 
            return false;
   }

    // This function allows us to print out our fraction in a human readable 
    // format.
    public String toString() {
        return (numerator + " / " + denominator);
    }
}
