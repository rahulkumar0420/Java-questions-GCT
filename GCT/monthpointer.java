import java.util.Scanner;

public class monthpointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        if (month >= 1 && month <= 12) {
            System.out.println("Month: " + months[month - 1]);
        } else {
            System.out.println("Invalid month number.");
        }
    }
}
