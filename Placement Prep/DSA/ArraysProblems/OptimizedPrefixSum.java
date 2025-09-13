package ArrayRevision;

import java.util.Scanner;

//Optimized approach of Prefix Sum
public class OptimizedPrefixSum {
	//Row-wise prefix sum of an Array
	public static void rowWisePrefixSum(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<m;j++) {
				arr[i][j] += arr[i][j-1];
			}
		}
		System.out.println("Row sum");
		for(int [] num : arr) {
			for(int val : num) {
				System.out.print(val +" ");
			}
			System.out.println();
		}
	}
	// Column-wise prefix sum of an Array
	public static void colWisePrefixSum(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] += arr[i-1][j];
			}
		}
		
		System.out.println("col sum");
		for(int [] num : arr) {
			for(int val : num) {
				System.out.print(val +" ");
			}
			System.out.println();
		}
	}
	
	 // Optimized prefix sum query for submatrix (r1, c1) to (r2, c2)
    public static int prefixSum(int[][] arr, int r1, int r2, int c1, int c2) {
        int total = arr[r2][c2];

        int top = (r1 > 0) ? arr[r1 - 1][c2] : 0;
        int left = (c1 > 0) ? arr[r2][c1 - 1] : 0;
        int addBack = (r1 > 0 && c1 > 0) ? arr[r1 - 1][c1 - 1] : 0;

        return total - top - left + addBack;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Row :");
		int row = scanner.nextInt();
		System.out.println("Enter size of Column :");
		int col = scanner.nextInt();
		System.out.println("Enter Array Elements :");
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Array elements :");
		for(int[] num : arr) {
			for(int val : num) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		System.out.println("Enter r1-coordinate :");
		int r1 = scanner.nextInt();
		System.out.println("Enter c1-coordinate :");
		int c1 = scanner.nextInt();
		System.out.println("Enter r2-coordinate :");
		int r2 = scanner.nextInt();
		System.out.println("Enter c2-coordinate :");
		int c2 = scanner.nextInt();
		System.out.println("Array Element : ");
		for(int[] num : arr) {
			for(int val : num) {
				System.out.print(val +" ");
			}
			System.out.println();
		}
		
		
		
		rowWisePrefixSum(arr);
		colWisePrefixSum(arr);
		int sum = prefixSum(arr,r1,r2,c1,c2);
		System.out.println("Prefix Sum Of an Array : "+ sum);
	}
}
