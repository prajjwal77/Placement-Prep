package ArrayRevision;

import java.util.Scanner;
//Brute force approach
public class PerfixSum {
	public static int perfixSum(int[][] arr, int r1,int r2,int c1, int c2) {
		int sum =0;
		for(int i=r1;i<=r2;i++) {
			for(int j=c1;j<=c2;j++) {
				sum+= arr[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
				};
		int r1 = 0, r2 = 3, c1 = 2, c2 = 3;
		System.out.println("Array Element : ");
		for(int[] num : arr) {
			for(int val : num) {
				System.out.print(val +" ");
			}
			System.out.println();
		}
		
		int sum = perfixSum(arr,r1,r2,c1,c2);
		System.out.println("Prefix Sum Of an Array : "+ sum);
	}
}
