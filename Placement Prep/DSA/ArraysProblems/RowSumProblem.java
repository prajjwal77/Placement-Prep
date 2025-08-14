import java.util.Scanner;

public class RowSumProblem {
     public static void printRowWiseSum(int[][] array, int rows, int cols) {
          for (int i = 0; i < rows; i++) {
               int sum = 0;
               for (int j = 0; j < cols; j++) {
                    sum += array[i][j];
               }
               System.out.println("Sum of row " + (i + 1) + ": " + sum);
          }
     }
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the number of rows: ");
          int rows = scanner.nextInt();
          System.out.print("Enter the number of columns: ");
          int cols = scanner.nextInt();
          int[][] array = new int[rows][cols];
          for(int i=0; i < rows; i++) {
               System.out.println("Enter elements for row " + (i + 1) + ":");
               for(int j = 0; j < cols; j++) {
                    array[i][j] = scanner.nextInt();
               }
          }
           // Call function to print row-wise sums
        printRowWiseSum(array, rows, cols);
     }
}
