public class SubsetArrayProblem {
     // This code finds a subset of an array that sums to a given target.
     // It returns the starting and ending indices of the subset if found, otherwise returns -1, -1.
     // Problem: Given an array of integers and a target sum, find a contiguous subset that sums to the target.
     // Example: For arr = [1, 2, 3, 4, 5] and target = 10, the subset is [2, 3, 4, 5] with indices (1, 4).
     // Time Complexity: O(n^2) where n is the length of the array.
     public static int[] findSubset(int[] arr, int target) {
          int n = arr.length;
          for (int start = 0; start < n; start++) {
               int sum = 0;
               for (int end = start; end < n; end++) {
                    sum += arr[end]; // Add the current element to the sum
                    if (sum == target) { // If the sum matches the target
                         return new int[]{start, end}; // Return the starting and ending indices of the subset
                    }
               }
          }
          return new int[]{-1, -1}; // Return -1, -1 if no subset found
     }
     //Algorithm Explanation:
     // 1. Iterate through the array with a starting index.
     // 2. For each starting index, iterate through the array to find the ending index.
     // 3. Maintain a running sum of the elements from the starting index to the ending index.
     // 4. If the running sum equals the target, return the indices.
     // 5. If no such subset is found, return -1, -1.
     
     public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 5};
          int target = 10;
          int[] result = findSubset(arr, target);
          if (result[0] != -1) {
               System.out.println("Subset found from index " + result[0] + " to " + result[1]);
          } else {
               System.out.println("No subset found with the given sum.");
          }
     }
}
