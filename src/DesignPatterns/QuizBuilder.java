package DesignPatterns;

import java.util.ArrayList;

public class QuizBuilder {
    public static void main(String[] args) {
       ArrayList<Question> quiz = new ArrayList<>();
       ArrayList<QuestionFactory> factories = new ArrayList<>();

       factories.add(new MultipleChoiceFactory(
            "Java", 
            2, 
            "Which keyword is used to create a class in java?", 
            new String[] {"class", "Class", "create", "new"},
             0)
        );

        factories.add(new TrueFalseFactory(
            "Java",  3, 
            "Java is a compiled language", true)
        );

        System.out.println("Building Quiz...");
        for(QuestionFactory factory : factories) {
            Question question = factory.createQuestion();
            quiz.add(question);
        }

        System.out.println("=====================================");
        System.out.println("      Java Practice Quiz             ");
        System.out.println("=====================================");

        int totalPoints = 0;
        for (int i = 0; i < quiz.size(); i++){
            System.out.println("Question " + (i + 1) + " (Points: " + quiz.get(i).getPoints() + ")");
            quiz.get(i).display();
            System.out.println("Correct Answer: " + quiz.get(i).getCorrectAnswer());
            System.out.println();
            totalPoints += quiz.get(i).getPoints();
        }

        System.out.println("-------------------------------");
        System.out.println("Total Possible Points: " + totalPoints);
    } 
}
