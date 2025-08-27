package ArrayRevision;

import java.util.Scanner;

public class FindSmallest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array element : ");
		
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int minElement = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(minElement>arr[i]) {
				minElement=arr[i];
			}
		}
		System.out.println("Min Element : "+minElement);
	}
}
