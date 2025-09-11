package ArrayRevision;
//Kadane's algo
public class MaxSubarraySum {
	public static int maxSubArraySum(int[] arr) {
		int currSum = arr[0];
		int maxSum = arr[0];
		int n = arr.length;
		for(int i=0;i<n;i++) {
			// Either extend the current subarray OR start a new subarray
			currSum = Math.max(arr[i], currSum+arr[i]);
			
			// Update maxSum if currSum is greater
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}
	 public static void main(String[] args) {
	        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

	        int maxSum = maxSubArraySum(arr);

	        System.out.println("Maximum Subarray Sum = " + maxSum);
	    }
}
