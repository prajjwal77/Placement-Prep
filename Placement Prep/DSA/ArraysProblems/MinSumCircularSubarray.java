/** About Min Sum Circular :  
      * Given a circular array A, find the minimum subarray sum.
      * The subarray can be non-contiguous and can wrap around the end of the array.
      * This problem is similar to Maximum Sum Circular Subarray but focuses on the minimum sum.
      */
public class MinSumCircularSubarray {
     public static int minSubarraySumCircular(int[] A) {
          int total = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
          int currentMax = 0, currentMin = 0;

          for (int num : A) {
               total += num;

               // Calculate maximum subarray sum using Kadane's algorithm
               currentMax = Math.max(currentMax + num, num);
               maxSum = Math.max(maxSum, currentMax);

               // Calculate minimum subarray sum using Kadane's algorithm
               currentMin = Math.min(currentMin + num, num);
               minSum = Math.min(minSum, currentMin);
          }

          // If all numbers are positive, return the minimum subarray sum
          if (minSum > 0) {
               return minSum;
          }

          // Return the minimum of the two cases: normal min or total - max
          return Math.min(minSum, total - maxSum);
     }
     public static void main(String[] args) {
          int[] arr = {1, -2, 3, -2};
          System.out.println(minSubarraySumCircular(arr)); // Output: -2
     }
}
