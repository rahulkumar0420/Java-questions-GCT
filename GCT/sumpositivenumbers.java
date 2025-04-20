import java.util.Scanner;

public class sumpositivenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            if (num < 0) continue;
            sum += num;
        }

        System.out.println("Sum of positive numbers: " + sum);
    }
}
