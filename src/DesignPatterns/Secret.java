package DesignPatterns;

public class Secret {
    private int answer;

    private static Secret instance = null;

    private Secret() {
        answer = 8;
    }

    public static synchronized Secret getAnswer() {
        if (instance == null) {
            instance = new Secret();
        }        

        return instance;
    }

    public boolean checkAnswer(int guess) {
        return guess == answer;
    }
}
