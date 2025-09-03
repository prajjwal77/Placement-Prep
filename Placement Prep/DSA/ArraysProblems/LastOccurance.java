package ArrayRevision;

public class LastOccurance {
	//applicable only on sorted array
	public static int lastOccurance(int[] arr, int target) {
		int low=0, high = arr.length-1;
		int result=-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == target) {
				result = mid;
				low = mid+1;
			}
			else if(arr[mid] < target) {
				low = mid +1;
			}
			else {
				high = mid-1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,4,5,5,5,6};
		int target = 5;
		int find = lastOccurance(arr, target);
		System.out.println("Last Occurance of "+target+" is : "+find);
	}

}
