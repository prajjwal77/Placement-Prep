package String;

import java.util.HashMap;
import java.util.Scanner;

public class countFrequency {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Variables to track the highest frequency element
        char maxChar = '\0';
        int maxFreq = 0;

        // Iterating through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Using getOrDefault
            int newCount = map.getOrDefault(ch, 0) + 1;
            map.put(ch, newCount);

            // Update max frequency character
            if (newCount > maxFreq) {
                maxFreq = newCount;
                maxChar = ch;
            }
        }

        System.out.println("Character frequencies:");
        for (char key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("\nHighest frequency character: " + maxChar + " (" + maxFreq + " times)");

        scanner.close();
    }
}
