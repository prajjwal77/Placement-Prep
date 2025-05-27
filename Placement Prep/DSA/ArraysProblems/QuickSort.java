public class QuickSort {
     /**
      * Quick Sort Algorithm (Steps)
      * 1. Choose a pivot element from the array.
      * 2. Partition the array into two halves:
      *    - Move all elements less than pivot to the left.
      *    - Move all greater elements to the right.
      * 3. Recursively apply the same steps to the left and right halves.
      * 4. Combine the sorted halves with the pivot in between.
      *
      * Time Complexity: O(n log n) on average, O(n^2) in the worst case (when the pivot is always the smallest or largest).
      * Space Complexity: O(log n) due to recursive stack space.
      * Example:
      * Input: [38, 27, 43, 3, 9, 82, 10]
      * Output: [3, 9, 10, 27, 38, 43, 82]
      */
     // Quick Sort implementation
     public  static void quickSort(int[] arr, int low, int high){
          if (low < high) {
               // Step 1: Partition the array
               int pivotIndex = partition(arr, low, high);
               
               // Step 2: Recursively sort the left and right halves
               quickSort(arr, low, pivotIndex - 1);
               quickSort(arr, pivotIndex + 1, high);
          }
     }
     // Helper method to partition the array
     private static int partition(int[] arr, int low, int high) {
          int pivot = arr[high]; // Choose the last element as pivot
          int i = low - 1; // Pointer for the smaller element

          for (int j = low; j < high; j++) {
               if (arr[j] < pivot) {
                    i++; // Increment index of smaller element
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
               }
          }
          // Swap arr[i + 1] and arr[high] (or pivot)
          int temp = arr[i + 1];
          arr[i + 1] = arr[high];
          arr[high] = temp;

          return i + 1; // Return the partition index
     }
     public static void main(String[] args) {
          int[] arr = {38, 27, 43, 3, 9, 82, 10};
          System.out.println("Original Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
          
          quickSort(arr, 0, arr.length - 1);
          
          System.out.println("Sorted Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
     }
}
