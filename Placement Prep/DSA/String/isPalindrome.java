public class isPalindrome {
     public static boolean isPalindrome(String str) {
          // Remove spaces and convert to lowercase
          str = str.replaceAll("\\s+", "").toLowerCase(); // Remove all whitespace and convert to lowercase
     
          // Get the length of the string
          int len = str.length();
     
          // Check characters from both ends towards the center
          for (int i = 0; i < len / 2; i++) {
               if (str.charAt(i) != str.charAt(len - 1 - i)) {
                    return false; // If characters don't match, it's not a palindrome
               }
          }
          return true; // If all characters match, it is a palindrome
     }
     
     public static void main(String[] args) {
          String str1 = "ABCBABA";
         if(isPalindrome(str1)) {
              System.out.println(str1 + " is a palindrome.");
          } else {
              System.out.println(str1 + " is not a palindrome.");
          }
     }
}
