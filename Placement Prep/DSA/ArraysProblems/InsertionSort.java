public class InsertionSort {
     /**
      * Insertion Sort Algorithm (Steps)
      * 1. Start from the second element (index 1), assume the first is already sorted.
      * 2. Store the current element (called key).
      * 3. Compare it with the elements before it.
      * 4. If the previous element is greater than the key, shift it to the right.
      * 5. Repeat until you find the correct position for the key.
      * 6. Insert the key at the correct position.
      * 7. Repeat steps 2–6 for all elements.
          * Time Complexity: O(n^2) in the worst and average cases, O(n) in the best case (when the array is already sorted).
          * Space Complexity: O(1) as it is an in-place sorting algorithm.
          * Example:
          * Input: [64, 34, 25, 12, 22, 11, 90]
          * Output: [11, 12, 22, 25, 34, 64, 90]
          */

     // Insertion Sort implementation
     public static void insertionSort(int[] arr){
          int n = arr.length;
          //start from the second element
          for(int i=1;i<n;i++){
               int key = arr[i]; // current element to be inserted
               int j = i-1; // index of the last sorted element
               
               // Shift elements of arr[0..i-1] that are greater than key
               while(j>=0 && arr[j]>key){
                    arr[j+1] = arr[j]; // shift element to the right
                    j--;
               }
               arr[j+1] = key; // insert the key at the correct position
          }
     }

     public static void main(String[] args) {
          int[] arr = {64, 34, 25, 12, 22, 11, 90};
          System.out.println("Original Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
          insertionSort(arr);
          System.out.println("Sorted Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
     }
}
