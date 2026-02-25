import java.util.Scanner;

public class InClass {
    // Question 1. 
    /**
     * Complete this method which needs to print all 
     * the counting numbers from 1 to and including n.
     * @param n: the upper number that we are counting towards
     */
    public void counting(int n) {
        // TODO
    }
    
    // Question 2
    /**
     * This method will play the game "Fizz Buzz", which 
     * is a simple counting game that starts at 1 and counts 
     * until reaches n. The rules for Fizz Buzz are as follows:
     * 1. If the given number is a multiple of 3: we say Fizz 
     *        instead of the number
     * 2. If the given number is a multiple of 5: we say Buzz 
     *        instead of the number 
     * 3. If the given number is a multiple of 15: we say FizzBuzz 
     *        instead of the number
     * 
     * A sample run through for fizzBuzz(11) would be
     * 1
     * 2
     * Fizz
     * 4
     * Buzz
     * Fizz
     * 7
     * 8
     * Fizz
     * Buzz
     * 11
     * @param n
     */
    public void fizzBuzz(int n) {
        // TODO
    }

    // Question 3
    /**
     * Fill out the remainder of this guessing game. The user will
     * have three attempts to guess your secret answer. Please include 
     * statements that let the user know if they are correct of incorrect.
     */
    public void simpleGame() {
        String answer = "";         // pick what you want the answer to be
        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess the secret answer is? ");
        String guess = input.nextLine();
        
        // Create a loop that allows the user to guess 
        // 3 times for the correct answer 


        input.close();
    }

    // Question 4
    /**
     * Repeat question 3, but know give the user unlimited guesses.
     * Keep track of how many guesses it takes them to figure out the 
     * answer.
     * 
     * Bonus task: If the user gets the correct answer, see if you
     * can have the repetition end and print out their number of guesses
     * @param 
     */
    public void complexGuess() {
        String answer = "";         // pick what you want the answer to be
        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess the secret answer is? ");
        String guess = input.nextLine();
        
        // Create a loop that allows the user to guess 
        // an infinite number of times for the correct answer 


        input.close();
    }

    // Question 5
    /**
     * Using a for loop, complete this method which will generate the 
     * multiplication table for the numbers start until end.
     * 
     * Sample output for the function call forTable(1, 10, 3)
     * ===========================================================
     *  1 * 3 = 3
     *  2 * 3 = 6
     *  3 * 3 = 9
     *  4 * 3 = 12
     *  5 * 3 = 15
     *  6 * 3 = 18
     *  7 * 3 = 21
     *  8 * 3 = 24
     *  9 * 3 = 27
     * 10 * 3 = 30
     * ===========================================================
     * @param start
     * @param end
     * @param tables
     */
    public void forTable(int start, int end, int tables) {
        //TODO
    }

    // Question 6
    /**
     * recreate question 5, but now use a while loop instead of a for-loop
     * @param start
     * @param end
     * @param tables
     */
    public void whileTable(int start, int end, int tables) {
        //TODO
    }

    // Question 7
    /**
     * Read the following method a determine what it is doing. Then when you 
     * understand what is happening write a comment in the designated section 
     * explaining what it is doing and include your answer to the following question
     * 
     * Was a do-while loop the best choice for this method? Or can we do this 
     * another way?
     */
    // =============================================================================
    /**
     * Your answer here:
     * 
     */
    public void mystery() {
        Scanner input = new Scanner(System.in);
        int val1 = 0, val2 = 0, val3 = 0;
        char answer;

        do {
            System.out.print("Please enter a number");
            int val4 = input.nextInt();
            if (val4 > 0) 
                val1++;
            else if (val4 < 0)
                val2++;
            else 
                val3++;

            System.out.println("Do you want to continue? y/n");
            answer = input.next().charAt(0);
        } while(answer == 'y' || answer == 'Y');
        input.close();

        System.out.println("Number Category 1: " + val1);
        System.out.println("Number Category 2: " + val2);
        System.out.println("Number Category 3: " + val3);
    }

    // In order to check your work, please make the approprite 
    // method calls in the main method.
    public static void main(String[] args) {
        InClass exercise = new InClass();
    }
}
