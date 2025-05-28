import java.util.Scanner;

public class RotateString {
     public static String rotateStringLeft(String s, int k) {
          if (s == null || s.length() == 0 || k < 0) {
               return s; // Return original if invalid input
          }
          
          k = k % s.length(); // Normalize k
          String part1 = s.substring(k);        // From k to end
          String part2 = s.substring(0, k);     // From start to k
          
          return part1 + part2; // Concatenate for left rotation
     }

     public static void main(String[] args) {
          String s = "abcdefg";
          int k;
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the number of positions to rotate the string to the left: ");
          k = scanner.nextInt();
          String rotatedString = rotateStringLeft(s, k);
          System.out.println("Original String: " + s);
          System.out.println("Rotated String: " + rotatedString);
     }
}
