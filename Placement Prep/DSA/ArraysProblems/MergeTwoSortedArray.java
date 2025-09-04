package ArrayRevision;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static int[] merge(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] arr = new int[n1+n2];
		int k=0;
		int j=0,i=0;
		// Merge like in merge sort
		while(i<n1 && j<n2) {
			if(arr1[i]<=arr2[j]) {
				arr[k++] = arr1[i++];
				
			}
			else {
				arr[k++] = arr2[j++];
				
			}
		}
		// Copy remaining elements from arr1
		while(i<n1) {
			arr[k++] = arr1[i++];
		}
		// Copy remaining elements from arr2
		while(j<n2) {
			arr[k++] = arr2[j++];
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,4,5,6,7,9};
		int[] arr2 = {2,3,4,7,8,9};
		
		int[] merged = merge(arr1, arr2);
		System.out.println("Merged Sorted Array : "+Arrays.toString(merged));
	}
}
