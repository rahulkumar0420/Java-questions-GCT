import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = reverseNumber(number);

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }

    // Method to reverse digits
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;           // Get last digit
            reversed = reversed * 10 + digit; // Append digit to reversed
            num /= 10;                      // Remove last digit
        }
        return reversed;
    }
}
