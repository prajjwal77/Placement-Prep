import java.util.Scanner;

public class ColSumProblem {

     public static void printColumnWiseSum(int[][] array, int rows, int cols) {
          for (int j = 0; j < cols; j++) {
               int sum = 0;
               for (int i = 0; i < rows; i++) {
                    sum += array[i][j];
               }
               System.out.println("Sum of column " + (j + 1) + ": " + sum);
          }
     }
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the number of rows: ");
          int rows = scanner.nextInt();
          System.out.print("Enter the number of columns: ");
          int cols = scanner.nextInt();
          int[][] array = new int[rows][cols];
          
          for(int i = 0; i < rows; i++) {
               System.out.println("Enter elements for row " + (i + 1) + ":");
               for(int j = 0; j < cols; j++) {
                    array[i][j] = scanner.nextInt();
               }
          }
          
          printColumnWiseSum(array, rows, cols);
     }
}
