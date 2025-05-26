public class SelectionSort {
     /**
      * Selection Sort Algorithm (Steps)
      * Selection Sort Algorithm (Step-by-Step)
      * 1. Start from the first element.
      * 2. Assume it is the smallest element in the unsorted part.
      * 3. Compare it with all other elements in the unsorted part.
      * 4. If a smaller element is found, remember its index.
      * 5. After checking all elements, swap the current element with the smallest found.
      * 6. Repeat this for the next position until the array is fully sorted.
      *
      * Time Complexity: O(n^2) in both worst and average cases.
      * Space Complexity: O(1) as it is an in-place sorting algorithm.
      * Example:
      * Input: [64, 34, 25, 12, 22, 11, 90]
      * Output: [11, 12, 22, 25, 34, 64, 90]
      */
      // Selection Sort implementation
       public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Step 1: Assume the current index has the smallest value
            int minIdx = i;

            // Step 2: Check the rest of the array for a smaller value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;  // Found new minimum
                }
            }

            // Step 3: Swap the smallest value with the value at current index
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
     public static void main(String[] args) {
          int[] arr = {64, 34, 25, 12, 22, 11, 90};
          System.out.println("Original Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
          selectionSort(arr);
          System.out.println("Sorted Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
     }
}
