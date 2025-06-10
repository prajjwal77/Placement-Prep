import java.util.Scanner;
import java.util.Stack;

public class StackOperationsUsingCollection {
     public static void main(String[] args) {
          // Using Java's built-in Stack class from the Collections framework
          // This class provides a simple way to perform stack operations
          // without needing to implement the stack logic manually.
          // Note: Stack is synchronized, but it is generally recommended to use Deque for stack operations in modern Java.
          Stack<Integer> stack = new Stack<>();
          //performing stack operations using switch case
          Scanner scanner = new Scanner(System.in);
          while (true) {
               System.out.println("Choose an operation:");
               System.out.println("1. Push");
               System.out.println("2. Pop");
               System.out.println("3. Peek");
               System.out.println("4. Check if empty");
               System.out.println("5. Check if full (not applicable for Stack)");
               System.out.println("6. Size");
               System.out.println("7. Display");
               System.out.println("8. Exit");
               System.out.print("Enter your choice: ");

               int choice = scanner.nextInt();
               switch (choice) {
                    case 1:
                         System.out.print("Enter value to push: ");
                         int value = scanner.nextInt();
                         stack.push(value);
                         break;
                    case 2:
                         if (!stack.isEmpty()) {
                              int poppedValue = stack.pop();
                              System.out.println("Popped value: " + poppedValue);
                         } else {
                              System.out.println("Stack Underflow");
                         }
                         break;
                    case 3:
                         if (!stack.isEmpty()) {
                              int peekValue = stack.peek();
                              System.out.println("Top value: " + peekValue);
                         } else {
                              System.out.println("Stack is empty");
                         }
                         break;
                    case 4:
                         System.out.println("Is stack empty? " + stack.isEmpty());
                         break;
                    case 5:
                         // Stack does not have a fixed size, so this is not applicable
                         System.out.println("Check if full is not applicable for Stack.");
                         break;
                    case 6:
                         System.out.println("Size of stack: " + stack.size());
                         break;
                    case 7:
                         System.out.println("Stack elements: " + stack);
                         break;
                    case 8:
                         System.out.println("Exiting...");
                         scanner.close();
                         return;
                    default:
                         System.out.println("Invalid choice, please try again.");
               }
          }
     }
}
