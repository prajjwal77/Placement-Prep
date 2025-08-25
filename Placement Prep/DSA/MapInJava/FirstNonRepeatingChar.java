package MapInJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string to check first non-repeating character : ");
		str = scan.nextLine();
		Map<Character,Integer> freq = new LinkedHashMap<>();//preserve order
		
		for(char c: str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:freq.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non-repeating character = "+entry.getKey());
				
				return;
				
			}
		}
		System.out.println("No non-repeatinng character found!");
	}
}
