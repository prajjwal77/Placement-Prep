package ArrayRevision;

public class SmallestSubWithSum {
	public static int smallestSubWithSum(int[] arr,int x) {
		int start = 0,end = 0, currSum = 0;
		int n = arr.length;
		int minLen = Integer.MAX_VALUE;
		
		while(end<n) {
		//add element until  sum > n
			while(currSum <= x && end < n) {
				currSum += arr[end++];
			}
		//shrink window  while sum > x
		while(currSum > x && start < n) {
			minLen = Math.min(minLen, end-start);
			currSum -= arr[start++];
		}
	  }
		return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 6, 10, 19 };
		int x = 51;
		int res = smallestSubWithSum(arr, x);
		if (res == 0)
			System.out.println("No subarray found");
		else
			System.out.println("Smallest subarray length is " + res);
	}
}
