import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find: ");
        int num = sc.nextInt();
        int count = 0;
        for (int x : arr) {
            if (x == num) count++;
        }
        System.out.println("Occurrences: " + count);
    }
}
