public class RemoveDuplicateFromSortedArray {
     public static int removeDuplicates(int[] nums) {
          if (nums.length == 0) return 0;
     
          int uniqueIndex = 0; // Pointer for the position of the last unique element
     
          for (int i = 1; i < nums.length; i++) {
               if (nums[i] != nums[uniqueIndex]) {
                    uniqueIndex++;
                    nums[uniqueIndex] = nums[i];
               }
          }
     
          return uniqueIndex + 1; // Length of the array with unique elements
     }
     
     public static void main(String[] args) {
          int[] nums = {1, 1, 2, 2, 3, 4, 4};
          int newLength = removeDuplicates(nums);
          
          System.out.println("New length: " + newLength);
          System.out.print("Array after removing duplicates: ");
          for (int i = 0; i < newLength; i++) {
               System.out.print(nums[i] + " ");
          }
     }
}
