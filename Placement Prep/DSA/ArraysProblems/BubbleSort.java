public class BubbleSort {
     /**
      * Bubble Sort  Simple Algorithm (Steps)
          * 1. Start with the first element of the array.
          * 2. Compare the current element with the next element.
          * 3. If the current element is greater than the next element, swap them.
          * 4. Move to the next element and repeat steps 2-3 until the end of the array is reached.
          * 5. After each pass, the largest unsorted element will "bubble up" to its correct position.
          * 6. Repeat the process for the remaining unsorted elements until the entire array is sorted.
          *OR
          * 1. Start from the beginning of the array.
          * 2. Compare each pair of adjacent elements.
          * 3. If the left element is greater than the right one, swap them.
          * 4. Repeat the above steps for all elements until no more swaps are needed.
           
      * Time Complexity: O(n^2) in the worst case, O(n) in the best case (when the array is already sorted).
      * Space Complexity: O(1) as it is an in-place sorting algorithm.
      * Example: 
          * Input: [64, 34, 25, 12, 22, 11, 90]
          * Output: [11, 12, 22, 25, 34, 64, 90]
      */
       // Bubble Sort implementation
     public  static void bubblSort(int[] arr){
          int n = arr.length;
          for(int i=0;i<n-1;i++){
               for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                         // swap arr[j] and arr[j+1]
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                    }
               }
          }
     }
     public static void main(String[] args) {
          int[] arr = {64, 34, 25, 12, 22, 11, 90};
          System.out.println("Original Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
          bubblSort(arr);
          System.out.println("Sorted Array:");
          for (int num : arr) {
               System.out.print(num + " ");
          }
          System.out.println();
     }
}
