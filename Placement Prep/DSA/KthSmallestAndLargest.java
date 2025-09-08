package ArrayRevision;

import java.util.Arrays;

public class KthSmallestAndLargest {
	public static int kthSmallest(int[] arr,int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	public static int kthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length-k];
	}
	public static void main(String[] args) {
		int[] arr = {2,1,4,5,6,4,2,7,8,0};
		System.out.println("Kth smallest num : "+ kthSmallest(arr, 1));
		System.out.println("Kth largest num : "+ kthLargest(arr, 1));
	}
}
