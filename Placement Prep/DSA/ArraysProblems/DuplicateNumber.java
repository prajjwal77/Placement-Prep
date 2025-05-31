
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {
     // Function to find the duplicate number in an array
     //write code to print all the duplicate numbers in an array using arrayList
    // This function assumes that there is exactly one duplicate in the array
        
    //Implement using arrayList 
    // and that the array contains integers in the range [1, n] where n is the size of the array.
        public static List<Integer> findAllDuplicates(int[] arr) {
            // Initialize a set to keep track of seen numbers
            Set<Integer> seen = new HashSet<>();
            // Initialize a list to store duplicates
            List<Integer> duplicates = new ArrayList<>();
            
            // Iterate through the array
            for (int num : arr) {
                // If the number is already in the set, it's a duplicate
                if (seen.contains(num)) {
                    // Add it to the duplicates list if not already added
                    if (!duplicates.contains(num)) {
                        duplicates.add(num);
                    }
                } else {
                    // Otherwise, add the number to the set
                    seen.add(num);
                }
            }
            
            return duplicates; // Return the list of duplicates
        }

        // Function to find a single duplicate number in an array
     public static int findDuplicate(int[] arr) {
         // Initialize a set to keep track of seen numbers
         Set<Integer> seen = new HashSet<>();
         
         // Iterate through the array
         for (int num : arr) {
             // If the number is already in the set, it's a duplicate
             if (seen.contains(num)) {
                 return num;
             }
             // Otherwise, add the number to the set
             seen.add(num);
         }
         
         // If no duplicate is found, return -1 (or throw an exception)
         return -1;
     }
     // Algorithm Explanation:
     // 1. Initialize an empty set to keep track of numbers we have seen.
     // 2. Iterate through each number in the array.
     // 3. For each number, check if it is already in the set.
     // 4. If it is, return that number as the duplicate.
     // 5. If it is not, add the number to the set.
     // 6. If no duplicates are found after checking all numbers, return -1 or throw an exception.

     
     public static void main(String[] args) {
           int[] arr = {1, 3, 4, 2, 2}; // Example array with a duplicate
           int duplicate = findDuplicate(arr);
           System.out.println("The duplicate number is: " + duplicate);

              // Example usage of findAllDuplicates
              int[] arrWithDuplicates = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};
                List<Integer> allDuplicates = findAllDuplicates(arrWithDuplicates);
                System.out.println("All duplicate numbers are: " + allDuplicates);
            // Example usage of findAllDuplicates
              int[] arrWithMultipleDuplicates = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};
                List<Integer> multipleDuplicates = findAllDuplicates(arrWithMultipleDuplicates);
                System.out.println("All duplicate numbers are: " + multipleDuplicates);
     }
}
