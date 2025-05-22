
import java.util.HashSet;

public class LongestSubstring {
     public static int lengthOfLongestSubstring(String s) {
          int n = s.length();
          int maxLength = 0;
          int left = 0;
          HashSet<Character> charSet = new HashSet<>();
     
          for (int right = 0; right < n; right++) {
               while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
               }
               charSet.add(s.charAt(right));
               maxLength = Math.max(maxLength, right - left + 1);
          }
     
          return maxLength;
     }
     public static void main(String[] args) {
            String s = "abcabcbb";
            System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
     }
}
