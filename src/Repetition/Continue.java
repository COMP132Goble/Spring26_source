public class Continue {
    public static void main(String[] args) {
        int sum = 0;
        int item = 0;

        while (item < 5) {
            item++;
            if (item == 2) {
                continue;
            }
            sum += item;
        }

        System.out.println("The sum is: " + sum);
    }
}
