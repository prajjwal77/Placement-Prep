import java.util.Arrays;

public class MergeSort {
     /**
      * Merge Sort Algorithm (Steps)
      * 1. Divide the array into two halves.
      * 2. Recursively sort each half.
      * 3. Merge the two sorted halves into one sorted array.
      * 4. Repeat until the entire array is sorted.
          *
          * Time Complexity: O(n log n) in all cases (worst, average, and best).
          * Space Complexity: O(n) due to the temporary arrays used for merging.
          * Example:
          * Input: [38, 27, 43, 3, 9, 82, 10]
          * Output: [3, 9, 10, 27, 38, 43, 82]
          */

     // Merge Sort implementation
     // Main merge sort method (recursive)
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            // Step 1: Split into left and right halves
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            // Step 2: Recursively sort both halves
            mergeSort(left);
            mergeSort(right);

            // Step 3: Merge sorted halves
            merge(arr, left, right);
        }
    }

    // Helper method to merge two sorted arrays into one
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right, and add the smaller one to arr
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
        }

        // Copy any remaining elements from left
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements from right
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
     public static void main(String[] args) {
           int[] arr = {38, 27, 43, 3, 9, 82, 10};
           System.out.println("Original Array:");
           for (int num : arr) {
                 System.out.print(num + " ");
           }
           System.out.println();
           
           mergeSort(arr);
           
           System.out.println("Sorted Array:");
           for (int num : arr) {
                 System.out.print(num + " ");
           }
           System.out.println();
     }
}
