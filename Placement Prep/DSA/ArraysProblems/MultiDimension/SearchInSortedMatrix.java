package ArrayRevision;

public class SearchInSortedMatrix {
	public static int searchInSortedMatrix(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;
        
        // Search row by row
        for (int i = 0; i < rows; i++) {
            int low = 0, high = cols - 1;
            
            // Binary search on row i
            while (low <= high) {
                int mid = low + (high - low) / 2;
                
                if (arr[i][mid] == key) {
                    System.out.println("Element found at row " + i + ", column " + mid);
                    return 1; // found
                } else if (arr[i][mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return -1; // not found
    }
	public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
            
            int key = 10;
            int search = searchInSortedMatrix(arr, key);
            
            if (search == -1) {
                System.out.println("Element Not Found!");
            } else {
                System.out.println("Element Found!");
            }

		
	}
}
