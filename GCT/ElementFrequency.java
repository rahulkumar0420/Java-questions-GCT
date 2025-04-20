import java.util.Scanner;

public class ElementFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to find
        System.out.print("Enter the element to count: ");
        int target = scanner.nextInt();

        // Count occurrences
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }

        // Output result
        System.out.println("Element " + target + " occurs " + count + " time(s) in the array.");

        scanner.close();
    }
}