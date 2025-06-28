public class KadaneAlgorithm {
     // Function to find the maximum subarray sum using Kadane's Algorithm
     public static int findMaxSubArraySum(int[] arr) {
          int maxSoFar = arr[0]; // Initialize maxSoFar with the first element
          int maxEndingHere = arr[0]; // Initialize maxEndingHere with the first element
          // Traverse the array starting from the second element
          for (int i = 1; i < arr.length; i++) {
               // Update maxEndingHere to be the maximum of the current element or the sum of max
               // EndingHere and the current element
               maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
               // Update maxSoFar to be the maximum of itself and maxEndingHere
               maxSoFar = Math.max(maxSoFar, maxEndingHere);
          }
          return maxSoFar; // Return the maximum subarray sum found
     }
     public static void main(String[] args) {
          int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
          int maxSum = findMaxSubArraySum(arr);
          System.out.println("Maximum Subarray Sum: " + maxSum);
     }
}
