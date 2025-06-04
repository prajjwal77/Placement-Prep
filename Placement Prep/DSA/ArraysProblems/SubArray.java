public class SubArray {
     // This code finds a subarray with a given sum in an array.
     // It returns the starting and ending indices of the subarray if found, otherwise returns -1, -1.
     //Problem: Given an array of integers and a target sum, find a contiguous subarray that sums to the target.
     //Example: For arr = [1, 2, 3, 7, 5] and target = 12, the subarray is [2, 3, 7] with indices (1, 3).
     //Time Complexity: O(n^2) where n is the length of the array.
     public static int[] findSubArray(int[] arr, int target) {
          int n = arr.length;
          for (int start = 0; start < n; start++) {
               int sum = 0;
               for (int end = start; end < n; end++) {
                    sum += arr[end];// Add the current element to the sum
                    if (sum == target) {// If the sum matches the target
                         return new int[]{start, end};// Return the starting and ending indices of the subarray
                    }
               }
          }
          return new int[]{-1, -1}; // Return -1, -1 if no subarray found
     }
     public static void main(String[] args) {
          int[] arr = {1, 2, 3, 7, 5};
          int target = 12;
          int[] result = findSubArray(arr, target);
          if (result[0] != -1) {
               System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
          } else {
               System.out.println("No subarray found with the given sum.");
          }
     }
}
