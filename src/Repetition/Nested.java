public class Nested {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 5; j++) {
                counter++;
                System.out.println("counter = " + counter);
            }
        }
    }
}
