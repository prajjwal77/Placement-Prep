package ArrayRevision;

import java.util.Arrays;
import java.util.Scanner;

public class RotateKthElement {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Enter the size of an array : ");
		n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter the index of array to rotate : ");
		int k = scanner.nextInt();

		if (k < 0 || k >= n) {
			System.out.println("Invalid index!");
			return;
		}

		// Rotate from k-th index using a simple approach (extra space)
		int[] rotated = new int[n];
		int idx = 0;

		// Copy from k to end
		for (int i = k; i < n; i++) {
			rotated[idx++] = arr[i];
		}
		// Copy from 0 to k-1
		for (int i = 0; i < k; i++) {
			rotated[idx++] = arr[i];
		}

		System.out.println("Rotated Array: " + Arrays.toString(rotated));

		

	}
}
