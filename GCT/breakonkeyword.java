import java.util.Scanner;

public class breakonkeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting loop...");
                break;
            }
            System.out.println("You entered: " + input);
        }
    }
}
