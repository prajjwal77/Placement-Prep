package String;

public class PallindromeString {
	 public static boolean isPalindrome(String str) {
	        if (str == null) return false;

	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // mismatch found
	            }
	            left++;
	            right--;
	        }
	        return true; // all characters matched
	    }
	public static void main(String[] args) {
		System.out.println("Palindrome string : "+ isPalindrome("madam"));
		System.out.println("Palindrome string : "+ isPalindrome("Hello"));
	}
}
