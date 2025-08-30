package ArrayRevision;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicate {
	public static ArrayList<Integer> findDuplicate(int[] arr){
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num : arr) {
			if(set.contains(num)) {
				list.add(num);
			}
			else {
				set.add(num);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,8,3,5,6,7,7};
		System.out.println("Duplicate Element Of an Array : "+ findDuplicate(arr));
	}
}
