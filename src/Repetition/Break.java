public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int item = 0;

        while (item < 5) {
            System.out.println("Running loop... Item = " + item);
            item++;
            sum += item;
            if (sum >= 6) {
                break;
            }
        }

        System.out.println("The sum is: " + sum);
    }
}
