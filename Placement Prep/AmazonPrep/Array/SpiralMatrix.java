
import java.util.ArrayList;

public class SpiralMatrix {
     public static ArrayList<Integer>spiralTraversal(int[][] arr){
          int n = arr.length; // number of rows
          int m = arr[0].length; // number of columns
          ArrayList<Integer> result = new ArrayList<>();
          // Define the boundaries of the spiral
          int top = 0, bottom = n-1, left =0, right = m-1;
          while(top<=bottom && left<=right){
               //Traverse left to right
               for(int i =left; i<=right; i++){
                    result.add(arr[top][i]);
               }
               top++; // Move the top boundary down

               //Traverse right top to bottom
               for(int i = top; i<=bottom; i++){
                    result.add(arr[i][right]);
               }
               right--; // Move the right boundary left

               if(top<=bottom){// Traverse right to left
                    // Traverse right to left
                    for(int i = right; i>=left; i--){
                         result.add(arr[bottom][i]);
                    }
                    bottom--; // Move the bottom boundary up
               }

               if(left<=right){// Traverse bottom to top
                    // Traverse bottom to top
                    for(int i = bottom; i>=top; i--){
                         result.add(arr[i][left]);
                    }
                    left++; // Move the left boundary right
               }
          }
          return result; // Return the spiral order traversal
     }
     public static void main(String[] args) {
          int[][] matrix = {
               {1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12},
               {13, 14, 15, 16}
          };

          ArrayList<Integer> spiralOrder = spiralTraversal(matrix);
          System.out.println("Spiral Order Traversal: " + spiralOrder);
          
     }
}
