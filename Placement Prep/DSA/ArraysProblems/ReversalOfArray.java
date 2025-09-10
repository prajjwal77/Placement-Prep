package ArrayRevision;


public class ReversalOfArray {
	//Optimized approach
	//TC: O(n)
	//SC: O(1)
	public static void reverse(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		reverse(arr);
		for(int num : arr) {
			System.out.print(num+" ");
		}
			
	}

}
