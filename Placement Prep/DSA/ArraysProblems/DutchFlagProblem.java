package ArrayRevision;

import java.util.Arrays;

public class DutchFlagProblem {
	public static void sort012(int[] arr) {
		int count0=0,count1=0,count2=0;
		for(int num: arr) {
			if(num == 0) count0++;
			else if (num == 1) count1++;
			else count2++;
		}
		int i=0;
		while(count0>0) {
			arr[i++] = 0;
			count0--;
		}
		while(count1>0) {
			arr[i++] = 1;
			count1--;
		}
		while(count2>0) {
			arr[i++] = 2;
			count2--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {2, 0, 2, 1, 1, 0, 2};
		sort012(arr);
		System.out.println("Sorted Array : "+ Arrays.toString(arr));
	}
}
