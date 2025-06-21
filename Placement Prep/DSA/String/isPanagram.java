public class isPanagram {
     public static void main(String[] args) {
            String str = "The quick brown fox jumps over the lazy dog";
            boolean isPanagram = true;
            boolean[] alphabet = new boolean[26];
     
            for (int i = 0; i < str.length(); i++) {
               char ch = str.charAt(i);
               if (Character.isLetter(ch)) {
                     int index = Character.toLowerCase(ch) - 'a';
                     alphabet[index] = true;
               }
            }
     
            for (boolean letter : alphabet) {
               if (!letter) {
                     isPanagram = false;
                     break;
               }
            }
     
            if (isPanagram) {
               System.out.println("The string is a pangram.");
            } else {
               System.out.println("The string is not a pangram.");
            }
     }
}
