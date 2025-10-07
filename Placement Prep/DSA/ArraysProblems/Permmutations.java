package ArrayRevision;

import java.util.ArrayList;
import java.util.List;

public class Permmutations {
	public static List<List<Integer>> permutation(int[] arr){
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<Integer>(), arr);
		return result;
	}
	public static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] arr) {
		if(temp.size() == arr.length) {
			result.add(new ArrayList<>(temp));
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(temp.contains(arr[i]))
				continue;
			
			temp.add(arr[i]);
			backtrack(result, temp, arr);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println("All possible distinct outcome : "+permutation(nums));
	}
}
