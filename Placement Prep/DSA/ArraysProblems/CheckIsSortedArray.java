public class CheckIsSortedArray {
     public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true; // An empty array is considered sorted
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Found an element that is less than the previous one
            }
        }
        
        return true; // All elements are in non-decreasing order 
     }
     public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 3, 4, 1, 2};
        int[] emptyArray = {};
        
        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray)); // true
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray)); // false
        System.out.println("Is emptyArray sorted? " + isSorted(emptyArray)); // true
     }
}
