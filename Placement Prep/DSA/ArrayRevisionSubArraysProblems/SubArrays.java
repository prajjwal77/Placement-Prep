package ArrayRevisionSubArraysProblems;

public class SubArrays {
    public static void subArray(int[] arr) {
        int n = arr.length;

        // Outer loop for start index
        for (int i = 0; i < n; i++) {
            // Middle loop for end index
            for (int j = i; j < n; j++) {
                // Inner loop to print elements from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // New line after each subarray
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subArray(arr);
    }
}
