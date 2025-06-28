public class MoveAllZerosToEnd {
     public static void moveZerosToEnd(int[] arr) {
          int nonZeroIndex = 0; // Pointer for the position of the next non-zero element
     
          // Traverse the array
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] != 0) {
                    // If the current element is non-zero, place it at the nonZeroIndex
                    arr[nonZeroIndex] = arr[i];
                    nonZeroIndex++;
               }
          }
     
          // Fill the remaining positions with zeros
          for (int i = nonZeroIndex; i < arr.length; i++) {
               arr[i] = 0;
          }
     }
     public static void main(String[] args) {
            int[] arr = {0, 1, 0, 3, 12};
            moveZerosToEnd(arr);
            for (int num : arr) {
               System.out.print(num + " ");
            }
     }
}
