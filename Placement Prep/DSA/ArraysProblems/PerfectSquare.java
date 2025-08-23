package Arrays;

import java.util.Scanner;

public class PerfectSquare {
	public static boolean isPerfectSquare(int num) {
		 int low = 1, high = num;
	        while (low <= high) {
	            long mid = (low + high) / 2;
	            if (mid * mid == num) {
	                return true;
	            } else if (mid * mid < num) {
	                low = (int) mid + 1;
	            } else {
	                high = (int) mid - 1;
	            }
	        }
	        return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter any number : ");
		n = scan.nextInt();
		
		boolean flag = isPerfectSquare(n);
		System.out.println(flag);
	}
}
