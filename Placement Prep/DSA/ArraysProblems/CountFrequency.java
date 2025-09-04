package ArrayRevision;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	public static Map<Integer, Integer> count(int[] arr){
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
		}
		return freqMap;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,3,2,5,6,7,5,3,2};
		System.out.println("Frequency Count of element : "+ count(arr));
	}
}
