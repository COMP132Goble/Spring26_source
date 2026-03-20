# Faulty Calculator
- Read through the calculator class and try to identify where potential problems might arise
- In the calculate method we have an unchecked method, what does this mean for our exception handling? Do we need to claim it?
- Wrap the body of the main() method in a try/catch that separately handles the following errors. For each catch block it should print out a specific message relating to the type 
of error that was caught.
    * InputMismatchException
    * ArithmeticException
- Add a finally block that always closes the Scanner and prints "Calculator session ended."
- Handle the IllegalArgumentException from calculate() in its own catch clause

