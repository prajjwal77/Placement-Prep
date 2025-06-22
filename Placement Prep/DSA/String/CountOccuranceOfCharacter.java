public class CountOccuranceOfCharacter {
     // Method to count occurrences of a specific character in a string
     public static int countCharacterOccurrences(String input, char character) {
          int count = 0;
          for (int i = 0; i < input.length(); i++) {
               if (input.charAt(i) == character) {     // Check if the character at the current index matches the specified character
                    count++; // Increment the count if it matches
               }
          }
          return count; // Return the total count of occurrences
     }
     public static void main(String[] args) {
          String input = "This is a test string with duplicate characters";
          char characterToCount = 't';
          int count = countCharacterOccurrences(input, characterToCount);
          System.out.println("The character '" + characterToCount + "' occurs " + count + " times in the string.");
     }
}
