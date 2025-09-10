package ArrayRevision;

public class CheckPallindrome {
	//Optimized approach
	//TC: O(n)
	//SC: O(1)
	public static boolean CheckPallindrome(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			if(arr[i] != arr[n-i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1};
		boolean flag = CheckPallindrome(arr);
		if(flag == false) {
			System.out.println("Not Pallindrome Array.");
		}
		else {
			System.out.println("Pallindrome Array.");
		}
	}
}
