package DesignPatterns;

interface Question {
    void display();
    boolean checkAnswer(String userAnswer);
    String getCorrectAnswer();
    int getPoints();    
}

class MultipleChoice implements Question {
    private String questionText;
    private String[] options;
    private int correctIndex;
    private int points;

    public MultipleChoice(String question, String[] options, int correct, int points) {
        this.questionText = question;
        this.options = options;
        this.correctIndex = correct;
        this.points = points;
    }

    public void display() {
        System.out.println(questionText);
        for(int i = 0; i < options.length; i++) {
            System.out.println(" " + (char)('A' + i) + ") " + options[i]);
        }
    }

    public boolean checkAnswer(String userAnswer) {
        int userIndex = userAnswer.toUpperCase().charAt(0) - 'A';
        return userIndex == correctIndex;
    }

    public String getCorrectAnswer() {
        return String.valueOf((char)('A' + correctIndex));
    }

    public int getPoints() {
        return points;
    }
}

class TrueFalseQuestion implements Question {
    private String questionText;
    private boolean correctAnswer;
    private int points;

    public TrueFalseQuestion(String question, boolean answer, int points) {
        this.questionText = question;
        this.correctAnswer = answer;
        this.points = points;
    }

    public void display() {
        System.out.println(questionText);
        System.out.println("   True");
        System.out.println("   False");
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase("true") == correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer ? "True" : "False";
    }

    public int getPoints() {
        return points;
    }
}
