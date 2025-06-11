
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class StackUsingQueue {

     public static void main(String[] args) {
          // Using two queues to implement stack operations
          // This implementation uses two queues to simulate stack behavior
          // by reversing the order of elements during push and pop operations.
          Queue<Integer> queue1 = new LinkedList<>();
          Queue<Integer> queue2 = new LinkedList<>();
          
          Scanner scanner = new Scanner(System.in);
          while (true) {
               System.out.println("Choose an operation:");
               System.out.println("1. Push");
               System.out.println("2. Pop");
               System.out.println("3. Peek");
               System.out.println("4. Check if empty");
               System.out.println("5. Size");
               System.out.println("6. Display");
               System.out.println("7. Exit");
               System.out.print("Enter your choice: ");
               
               int choice = scanner.nextInt();
               switch (choice) {
                    case 1:
                         System.out.print("Enter value to push: ");
                         int value = scanner.nextInt();
                         queue1.add(value);
                         while (!queue2.isEmpty()) {
                              queue1.add(queue2.poll());
                         }
                         Queue<Integer> temp = queue1;
                         queue1 = queue2;
                         queue2 = temp;
                         break;
                    case 2:
                         if (!queue2.isEmpty()) {
                              int poppedValue = queue2.poll();
                              System.out.println("Popped value: " + poppedValue);
                         } else {
                              System.out.println("Stack Underflow");
                         }
                         break;
                    case 3:
                         if (!queue2.isEmpty()) {
                              int peekValue = queue2.peek();
                              System.out.println("Top value: " + peekValue);
                         } else {
                              System.out.println("Stack is empty");
                         }
                         break;
                    case 4:
                         System.out.println("Is stack empty? " + queue2.isEmpty());
                         break;
                    case 5:
                         System.out.println("Size of stack: " + queue2.size());
                         break;
                    case 6:
                         System.out.println("Stack elements: " + queue2);
                         break;
                    case 7:
                         System.out.println("Exiting...");
                         scanner.close();
                         return;
                    default:
                         System.out.println("Invalid choice, please try again.");
               }
          }
     }
}
