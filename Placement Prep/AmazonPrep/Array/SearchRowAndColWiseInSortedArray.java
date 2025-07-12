public class SearchRowAndColWiseInSortedArray {
     public static boolean binarySearch(int[] row, int target){
          int left =0, right = row.length-1;
          while(left<right){
               int mid = left+(right-left)/2;
               if(row[mid] == target){
                    return true;
               }
               else if(row[mid] < target){
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }
          return false;
     }
     //TC = O(n log m) where n is the number of rows and m is the number of columns
     //SC = O(1) as we are not using any extra space
     public static boolean search(int[][] matrix , int target){
          int n = matrix.length;// number of rows
          for(int i=0 ; i<n ; i++){
                if (binarySearch(matrix[i], target)) 
                return true;  // Element found in one of the rows
          }
          return false; // Element not found in any row
     }
   //approach 2 
     //TC = O(n + m) where n is the number of rows and m is the number of columns
     //SC = O(1) as we are not using any extra space
     public static boolean searchRowWise(int[][]matrix , int target){
          int n =matrix.length;// number of rows
          int m = matrix[0].length;// number of columns
          int row = 0, col = m - 1; // start from top-right corner
          while(row<n && col>=0){
               if(matrix[row][col] == target){
                    return true; // Element found
               } else if(matrix[row][col] > target){
                    col--; // Move left
               } else {
                    row++; // Move down
               }
          }
          return false; // Element not found
     }
public static void main(String[] args) {
          int[][] matrix = {
               {10, 20, 30, 40},
               {15, 25, 35, 45},
               {27, 29, 37, 48},
               {32, 33, 39, 50}
          };
          int target = 25;
          boolean found = search(matrix, target);
          System.out.println("Element found: " + found);

          boolean foundRowWise = searchRowWise(matrix, target);
          System.out.println("Element found using row-wise search: " + foundRowWise);
     }
}
