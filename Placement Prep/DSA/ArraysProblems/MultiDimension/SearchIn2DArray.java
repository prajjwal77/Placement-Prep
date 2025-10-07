package ArrayRevision.MultiDimension;



public class SearchIn2DArray {
	public static boolean binarySearch(int[] arr, int key) {
		int n = arr.length;
		int low = 0, high = n-1;
		while(low<=high) {
			int mid =(high+low)/2;
			if(arr[mid] == key) {
				return true;
			}
			else if(arr[mid] < key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return false;
		
	}
	public static boolean search(int[][] arr, int key) {
		int n = arr.length;
		
		for(int[] num : arr) {
			if(binarySearch(num, key)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int key = 0;
		boolean bool = search(arr, key);
		if(bool) {
			System.out.println("Element found.");
		}
		else {
			System.out.println("Element not FOund.");
		}
	}
}
