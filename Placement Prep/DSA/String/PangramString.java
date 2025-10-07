package String;

public class PangramString {
	public static boolean isPangram(String str) {
		str = str.toLowerCase();
		
		//boolean array to track letters
		boolean[] seen = new boolean[26];
		
		
		for(char c : str.toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				seen[c-'a'] = true;
			}
		}
		
		//check if all 26 letters are present
		for(boolean b : seen) {
			if(!b)
				return false;
		}
		
		return true;
	}
	
	 public static void main(String[] args) {
	        String s1 = "The quick brown fox jumps over the lazy dog";
	        String s2 = "Hello world";

	        System.out.println("s1 is pangram? " + isPangram(s1)); // true
	        System.out.println("s2 is pangram? " + isPangram(s2)); // false
	    }
}
