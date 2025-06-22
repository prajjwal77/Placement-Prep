import java.util.HashMap;

public class CountTheFrequencyOfCharacters {
     //Using HashMap to count the frequency of each character in a string
     public static void countCharacterFrequency(String input) {
          // Create a HashMap to store character frequencies
          HashMap<Character, Integer> frequencyMap = new HashMap<>(); 
          // Iterate through each character in the input string
          for (char c : input.toCharArray()) {
               // If the character is already in the map, increment its count
               frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
          }
          // Print the frequency of each character
          for (java.util.Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
               System.out.println("Character: '" + entry.getKey() + "' Frequency: " + entry.getValue());
          }
     }
     public static void main(String[] args) {
          String input = "University";
          System.out.println("Input String: " + input);
          System.out.println("Character Frequency Count:");
          countCharacterFrequency(input); // Call the method to count character frequency

     }
}
