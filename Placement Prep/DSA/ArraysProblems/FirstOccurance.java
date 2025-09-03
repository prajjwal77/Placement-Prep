package ArrayRevision;

public class FirstOccurance {
	//applicable in sorted arr only
	public static int firstOccurance(int[] arr, int target) {
		int  low=0, high=arr.length-1;
		int result =-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(arr[mid] == target) {
				result = mid;
				high = mid-1;
			}
			else if(arr[mid]<target){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,4,5};
		int target = 2;
		int find = firstOccurance(arr, target);
		System.out.println("First Occurance of "+target+" is :"+find);
	}
}
