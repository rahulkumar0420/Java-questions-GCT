import java.util.Scanner;

public class countoccurrencesforeach {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 5, 8, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to count: ");
        int target = sc.nextInt();
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Occurrences of " + target + ": " + count);
    }
}
