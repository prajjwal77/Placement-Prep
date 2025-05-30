public class FindMissingNumber {
     // Function to find the missing number in an array
     public static int findMissingNumber(int[] arr, int n) {
         // Calculate the expected sum of numbers from 1 to n
         int expectedSum = n * (n + 1) / 2;
         
         // Calculate the actual sum of the elements in the array
         int actualSum = 0;
         for (int num : arr) {
             actualSum += num;
         }
         
         // The missing number is the difference between expected and actual sum
         return expectedSum - actualSum;
     }

     //Algorithm Explanation:
     // 1. Calculate the expected sum of the first n natural numbers using the formula n * (n + 1) / 2.
     // 2. Calculate the actual sum of the elements present in the array.
     // 3. The missing number is the difference between the expected sum and the actual sum.
     

     // Main method to test the findMissingNumber function
     public static void main(String[] args) {
            int[] arr = {1, 2, 4, 5, 6}; // Example array
            int n = arr.length + 1; // The size of the array should be n-1
            
            int missingNumber = findMissingNumber(arr, n);
            System.out.println("The missing number is: " + missingNumber);
     }
}
