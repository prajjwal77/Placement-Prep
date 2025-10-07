package ArrayRevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public static List<List<Integer>> combination(int[] arr,int target){
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result,new ArrayList<Integer>(), arr, target,0);
		return result;
	}
	public static void backtrack(List<List<Integer>> result, List<Integer>temp,int[] arr,int target, int start) {
		if(target<0) {
			return ;
		}
		if(target == 0) {
			result.add(new ArrayList<>(temp));
			
		}
		for(int i= start;i<arr.length;i++) {
			temp.add(arr[i]);
			backtrack(result, temp, arr, target-arr[i], i);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,3,6,7,1,5};
		int target = 5;
		System.out.println("Array : "+Arrays.toString(arr)+" Target : "+target);
		System.out.println("Combination : "+combination(arr, target));
	}
}
