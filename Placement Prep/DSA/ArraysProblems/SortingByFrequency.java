
import java.util.Arrays;

public class SortingByFrequency {
     //sort the array higher frequency first then assending order
     public static int[] sortByFrequency(int[] arr) {
            // Create a frequency array
            int[] frequency = new int[1001]; // Assuming the numbers are in the range 0-1000
            for (int num : arr) {
               frequency[num]++;
            }

            // Convert int[] to Integer[] for custom sorting
            Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

            // Sort the array based on frequency and then by value
            Arrays.sort(boxedArr, (a, b) -> {
                if (frequency[b] != frequency[a]) {
                    return Integer.compare(frequency[b], frequency[a]); // Higher frequency first
                } else {
                    return Integer.compare(a, b); // Ascending order for same frequency
                }
            });

            // Convert Integer[] back to int[]
            for (int i = 0; i < arr.length; i++) {
                arr[i] = boxedArr[i];
            }

            return arr;
     }
     public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4,9,8,7};
            int[] sortedArr = sortByFrequency(arr);
            System.out.println(Arrays.toString(sortedArr)); // Output: [4, 4, 4, 4, 3, 3, 3, 2, 2, 1, 7, 8, 9]
     }
}
