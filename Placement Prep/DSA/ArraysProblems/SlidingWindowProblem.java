package ArrayRevision;

//Maximum sum subarray of size k
public class SlidingWindowProblem {
//	Time Complexity: O(n)
//	Space Complexity: O(1)
	public static int maxSumOfK(int[] arr, int k) {
		int windowSum = 0;
		int n = arr.length;
		if (n < k) {
			System.out.println("Window size is larger than array size!");
			return -1;
		}
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		
		 int maxSum = windowSum;
		for (int i = k; i < n; i++) {
			windowSum += arr[i] - arr[i - k]; // Add new, remove old
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		System.out.println("Maximum sum of subarray of size " + k + " = " + maxSumOfK(arr, k));

		int[] arr2 = { 1, 9, -1, -2, 7, 3, -1, 2 };
		int k2 = 4;
		System.out.println("Maximum sum of subarray of size " + k2 + " = " + maxSumOfK(arr2, k2));
	}
}
