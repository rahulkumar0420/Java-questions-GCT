import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate absolute value
        int absoluteValue = (number < 0) ? -number : number;

        // Output the result
        System.out.println("The absolute value of " + number + " is: " + absoluteValue);

        scanner.close();
    }
}
