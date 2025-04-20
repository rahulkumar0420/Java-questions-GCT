public class maxvalueforeach {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 42, 19};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
