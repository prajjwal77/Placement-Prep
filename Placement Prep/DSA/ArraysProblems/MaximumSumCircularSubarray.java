/** About Max Sum Array : 
 * Given a circular array A, find the maximum subarray sum.
 * The subarray can be non-contiguous and can wrap around the end of the array.
 * This problem is similar to Minimum Sum Circular Subarray but focuses on the maximum sum.
 */
public class MaximumSumCircularSubarray {
     public static int maxSubarraySumCircular(int[] A) {
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
     
          // If all numbers are negative, return the maximum subarray sum
          if (maxSum < 0) {
               return maxSum;
          }
     
          // Return the maximum of the two cases: normal max or total - min
          return Math.max(maxSum, total - minSum);
     }
     public static void main(String[] args) {
            int[] arr = {1, -2, 3, -2};
            System.out.println(maxSubarraySumCircular(arr)); // Output: 3
     }
}
