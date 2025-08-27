package ArrayRevision;

import java.util.Scanner;

public class FindLargest {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the size of an Array : ");
		n= scan.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter array element:");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		int largestElement = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(largestElement<arr[i]) {
				largestElement= arr[i];
			}
		}
		System.out.println("Largest Element : "+ largestElement);
		
	}
}
