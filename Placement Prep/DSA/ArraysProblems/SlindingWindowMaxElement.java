package ArrayRevision;

public class SlindingWindowMaxElement {
	public static int maxElement(int[] arr, int k) {
		int n = arr.length;
		int maxEle = Integer.MIN_VALUE;
		for(int i=0;i<n-(k-2);i++) {
			for(int j=i;j < i+k-1;j++) {
				maxEle = Math.max(maxEle, arr[j]);
			}
		}
		return maxEle;
	}
	public static void main(String[] args) {
		int[] arr = {222,4,7,10,12,15,25,1700};
		System.out.println("Max element : "+ maxElement(arr, 4));
	}
}
