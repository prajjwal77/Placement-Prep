import java.util.HashMap;
import java.util.Scanner;
// This program calculates the frequency of each character in a given string

public class CharFrequency {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String input;
          System.out.println("Enter a string:");
          input = scanner.nextLine();
          // Create a HashMap to store character frequencies
          // HashMap<Character, Integer> frequencyMap = new HashMap<>();
          // or
          // HashMap<Character, Integer> frequencyMap = new HashMap<>(input.length());

          HashMap<Character, Integer> frequencyMap = new HashMap<>();

          for (int i = 0; i < input.length(); i++) {
               char ch = input.charAt(i);

               if (frequencyMap.containsKey(ch)) {
                    int count = frequencyMap.get(ch); // Get the current count
                    // Increment the count by 1
                    // and update the map
                    // frequencyMap.put(ch, count + 1);
                    // or
                    // frequencyMap.put(ch, frequencyMap.get(ch) + 1);
                    frequencyMap.put(ch, count + 1);
               } else {
                    // If the character is not in the map, add it with a count of 1
                    // frequencyMap.put(ch, 1);
                    // or
                    // frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
                    frequencyMap.put(ch, 1);
               }
          }

          System.out.println("Character Frequency:");
          for (Character key : frequencyMap.keySet()) {
               System.out.println(key + " -> " + frequencyMap.get(key));
          }

          //write code to print  highest frequency character
          int maxFrequency = 0;
          char maxChar = ' ';
          for (Character key : frequencyMap.keySet()) {
               if (frequencyMap.get(key) > maxFrequency) {
                    maxFrequency = frequencyMap.get(key);
                    maxChar = key;
               }
          }
          System.out.println("Highest frequency character: " + maxChar + " -> " + maxFrequency);
          //write code to print  lowest frequency character
          int minFrequency = Integer.MAX_VALUE;
          char minChar = ' ';
          for (Character key : frequencyMap.keySet()) {
               if (frequencyMap.get(key) < minFrequency) {
                    minFrequency = frequencyMap.get(key);
                    minChar = key;
               }
          }
          System.out.println("Lowest frequency character: " + minChar + " -> " + minFrequency);
     }
}
