public class MinInArray {
     public static int findMin(int[] arr) {
         if (arr == null || arr.length == 0) {
             throw new IllegalArgumentException("Array must not be null or empty");
         }
         
         int min = arr[0]; // Assume the first element is the minimum
         
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = arr[i]; // Update min if a smaller element is found
             }
         }
         
         return min; // Return the minimum value found
     }
     public static void main(String[] args) {
         int[] array = {3, 5, 7, 2, 8, -1, 4};
         int[] emptyArray = {};
         
         System.out.println("Minimum in array: " + findMin(array)); // Output: -1
         
         try {
             System.out.println("Minimum in empty array: " + findMin(emptyArray)); // Should throw an exception
         } catch (IllegalArgumentException e) {
             System.out.println(e.getMessage()); // Output: Array must not be null or empty
         }
     }
}
