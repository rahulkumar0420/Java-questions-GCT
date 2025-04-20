import java.util.Scanner;

public class MinOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find minimum
        int min = (num1 < num2) ? num1 : num2;

        // Output result
        System.out.println("The minimum of " + num1 + " and " + num2 + " is: " + min);

        scanner.close();
    }
}
