package ArrayRevision.MultiDimension;

public class Rotate2DArray {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int n = arr.length;
		int m = arr[0].length;
		int[][] arr2 = new int[n][m];
//		System.out.println(n);
//		System.out.println(m);
		System.out.println("Before Rotation : ");
		for(int[] row : arr) {
			for(int num : row) {
				System.out.print(num +" ");
			}
			System.out.println();
		}
		
		//rotation logic
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr2[i][j] = arr[m-j-1][i];
				
			}
		}
		System.out.println("Rotated Array : ");
		for (int[] row : arr2) {   // each row is a 1D array
		    for (int val : row) {  // each element in that row
		        System.out.print(val + " ");
		    }
		    System.out.println();
		}
	}
}
