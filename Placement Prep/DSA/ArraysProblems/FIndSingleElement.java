package ArrayRevision;

import java.util.HashMap;
import java.util.HashSet;

import DynamicProgramming.StairCaseProblem;

public class FIndSingleElement {
	//1. Approach using HashSet -> Better approach
	public static int findSingleElement(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(set.contains(num)) {
				set.remove(num);
			}
			else {
				set.add(num);
			}
		}
		// The remaining element in set is the single one
		return set.iterator().next();
	}
	//2. Approach using HashMap
	public static int findSingleEle(int[] arr) {
		HashMap<Integer, Integer> freq = new HashMap<>();
		//count frequency
		for(int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0)+1);
		}
		
		//find element with frequency 1
		for(int num:arr) {
			if(freq.get(num)==1){
				return num;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,4,2,3,5};
		System.out.println("Single Element of an Array : "+findSingleElement(arr));
		System.out.println("Single Element of an Array : "+findSingleEle(arr));
	}
}
