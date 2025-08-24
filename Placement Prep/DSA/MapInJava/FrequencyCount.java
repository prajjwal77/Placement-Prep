package MapInJava;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,2,4,1};
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		System.out.println(map);
	}
}
