package DesignPatterns;

abstract class QuestionFactory {
    protected String subject;
    protected int difficulty;   // 1 - 5 scale
    
    public QuestionFactory(String subject, int difficulty) {
        this.subject = subject;
        this.difficulty = difficulty;
    }

    public abstract Question createQuestion();

    protected int calculatePoints() {
        return difficulty * 10;
    }
}

class MultipleChoiceFactory extends QuestionFactory {
    private String questionText;
    private String[] options;
    private int correctIndex;

    public MultipleChoiceFactory(String subject, int difficulty, String quetsion, String[] options, int correct) {
        super(subject, difficulty);
        this.questionText = quetsion;
        this.options = options;
        this.correctIndex = correct;
    }

    public Question createQuestion() {
        return new MultipleChoice("[" + subject + "] " + questionText, options, correctIndex, calculatePoints());
    }
}

class TrueFalseFactory extends QuestionFactory {
    private String questionText;
    private boolean correctAnswer;

    public TrueFalseFactory(String subject, int difficulty, String question, boolean correct) {
        super(subject, difficulty);
        this.questionText = question;
        this.correctAnswer = correct;
    }

    public Question createQuestion() {
        return new TrueFalseQuestion("[" + subject + "] " + questionText, correctAnswer, calculatePoints());
    }
}