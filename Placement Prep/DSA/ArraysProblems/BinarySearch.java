package ArrayRevision.SearchingAndSorting;


public class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
		int low=0;
		int high = arr.length;
		
		while(low<high) {
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid]<key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {3,4,6,7,8,9};
		int key = 7;
		int idx = binarySearch(arr,key);
		if(idx == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Element Found Ar Index : "+idx);
		}
	}
}
