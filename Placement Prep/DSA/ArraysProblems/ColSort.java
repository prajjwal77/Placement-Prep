package Arrays;

import java.util.Arrays;

public class ColSort {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 2, 9},
            {8, 1, 6},
            {7, 3, 4}
        };

        int rows = arr.length, cols = arr[0].length;

        for (int c = 0; c < cols; c++) {
            int[] col = new int[rows];

            // extract column
            for (int r = 0; r < rows; r++) {
                col[r] = arr[r][c];
            }

            // sort column
            Arrays.sort(col);

            // put back sorted column
            for (int r = 0; r < rows; r++) {
                arr[r][c] = col[r];
            }
        }

        // Print sorted columns
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}

