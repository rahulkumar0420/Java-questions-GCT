public class maxmin {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int max = arr[0];
        int min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
