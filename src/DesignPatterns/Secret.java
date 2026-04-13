package DesignPatterns;

public class Secret {
    private int answer;
    private int answer2;

    private static Secret instance = null;

    private Secret() {
        answer = 870;
        answer2 = 675;
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

    public boolean checkSecondAnswer(int guess) {
        return guess == answer2;
    }
}
