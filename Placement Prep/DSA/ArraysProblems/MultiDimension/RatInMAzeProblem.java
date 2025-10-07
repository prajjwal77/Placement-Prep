package ArrayRevision.MultiDimension;

public class RatInMAzeProblem {
    public static boolean isSafe(int[][] maze, int i, int j, int n) {
        // Check if within bounds and cell is not blocked
        if (i >= 0 && i < n && j >= 0 && j < n && maze[i][j] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean solveMaze(int[][] maze, int[][] output, int i, int j, int n) {
        // Base case: if we reached destination
        if (i == n - 1 && j == n - 1 && maze[i][j] == 1) {
            output[i][j] = 1;
            return true;
        }

        if (isSafe(maze, i, j, n)) {
            if (output[i][j] == 1) {
                return false; // already visited
            }

            // mark as part of solution path
            output[i][j] = 1;

            // Move right
            if (solveMaze(maze, output, i, j + 1, n) == true) {
                return true;
            }

            // Move down
            if (solveMaze(maze, output, i + 1, j, n) == true) {
                return true;
            }

            // backtrack
            output[i][j] = 0;
            return false;
        }
        return false;
    }

    public static void print(int[][] arr) {
        for (int[] num : arr) {
            for (int val : num) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 1, 1},
                {0, 1, 1, 1}
        };

        int n = arr.length;
        System.out.println("MAZE : ");
        print(arr);

        int[][] output = new int[n][n];
        System.out.println("Final Path :");

        if (solveMaze(arr, output, 0, 0, n) == true) {
            print(output);
        } else {
            System.out.println("Solution does not exist.");
        }
    }
}
            