import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the maximum value
        System.out.print("Enter the maximum number for Fibonacci series: ");
        int max = scanner.nextInt();

        System.out.println("Fibonacci series up to " + max + ":");
        printFibonacciUpTo(max);
    }

    // Method to print Fibonacci series up to a given number
    public static void printFibonacciUpTo(int max) {
        int a = 0, b = 1;

        while (a <= max) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
