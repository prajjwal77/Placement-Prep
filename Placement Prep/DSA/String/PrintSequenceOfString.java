package String;

import java.util.ArrayList;

public class PrintSequenceOfString {
	public static void printSequence(int[] arr, int idx, ArrayList<Integer> tempArr) {
		if(idx == arr.length) {
			if(tempArr.size()>0) {
				System.out.println(tempArr);
			}
			return;
		}
		//recursive call
		//include
		printSequence(arr, idx+1, tempArr);
		//add the value in tempArr
		tempArr.add(arr[idx]);
		//do not include
		printSequence(arr, idx+1, tempArr);
		//remove the last value
		tempArr.remove(tempArr.size()-1);
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		int idx =0;
		printSequence(arr, idx, new ArrayList<Integer>());
	}
}
