package MapInJava;

import java.util.HashMap;
import java.util.Map;

public class ArraysEqualIgnoreOrder {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,2,3};
		int[] arr2= {2,1,3,1,2};
		
		if(arr1.length !=arr2.length){
			System.out.println("false");
			return;
		}
		
		Map<Integer, Integer> freq = new HashMap<>();
		
		for(int num:arr1) {
			freq.put(num, freq.getOrDefault(num, 0)+1);
		}
		
		for(int num : arr2) {
			if(!freq.containsKey(num)) {
				System.out.println("fal   se");
				return;
			}
			
			freq.put(num, freq.get(num)-1);
			if(freq.get(num)==0) {
				freq.remove(num);
			}
		}
		
		System.out.println(freq.isEmpty());
	}
}
