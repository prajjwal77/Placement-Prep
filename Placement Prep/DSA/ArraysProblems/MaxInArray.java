public class MaxInArray {
     public static int findMax(int[] arr) {
         if (arr == null || arr.length == 0) {
             throw new IllegalArgumentException("Array must not be null or empty");
         }
         
         int max = arr[0]; // Assume the first element is the maximum
         
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = arr[i]; // Update max if a larger element is found
             }
         }
         
         return max; // Return the maximum value found
     }
     public static void main(String[] args) {
         int[] array = {3, 5, 7, 2, 8, -1, 4};
         int[] emptyArray = {};
         
         System.out.println("Maximum in array: " + findMax(array)); // Output: 8
         
         try {
             System.out.println("Maximum in empty array: " + findMax(emptyArray)); // Should throw an exception
         } catch (IllegalArgumentException e) {
             System.out.println(e.getMessage()); // Output: Array must not be null or empty
         }
     }
}
