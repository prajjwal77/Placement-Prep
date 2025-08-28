package ArrayRevision;

import java.util.Arrays;
import java.util.Scanner;


public class ReverseArray {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array : ");
		n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter your array element to reverse : ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		   // Fix: only loop till n/2
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
		
		System.out.println("Reversed Array : "+Arrays.toString(arr));
	}
}
