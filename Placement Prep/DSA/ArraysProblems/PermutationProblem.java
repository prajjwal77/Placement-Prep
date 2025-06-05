public class PermutationProblem {
     public void permute(int[] nums) {
          backtrack(nums, 0);
     }
     private void backtrack(int[] nums, int start) {
          if (start == nums.length - 1) {
               System.out.println(java.util.Arrays.toString(nums));
               return;
          }
          for (int i = start; i < nums.length; i++) {
               swap(nums, start, i);
               backtrack(nums, start + 1);
               swap(nums, start, i); // backtrack
          }
     }
     private void swap(int[] nums, int i, int j) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
     }
     // Example usage
     // This will generate all permutations of the array [1, 2, 3]
     // and print them to the console.
     // Output:
     // [1, 2, 3]
     // [1, 3, 2]
     // [2, 1, 3]
     // [2, 3, 1]
     // [3, 2, 1]
     // [3, 1, 2]
     
     public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            PermutationProblem solution = new PermutationProblem();
            solution.permute(nums);
     }
}
