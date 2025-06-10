
import java.util.Scanner;

public class StackOperations {
     private int[] stack;
     private int top;
     private int capacity;
     
     public StackOperations(int size) {
          stack = new int[size];
          capacity = size;
          top = -1;
     }
     
     public void push(int value) {
          if (top == capacity - 1) {
               System.out.println("Stack Overflow");
               return;
          }
          stack[++top] = value;
     }
     
     public int pop() {
          if (top == -1) {
               System.out.println("Stack Underflow");
               return -1; // Indicating stack is empty
          }
          return stack[top--];
     }
     
     public int peek() {
          if (top == -1) {
               System.out.println("Stack is empty");
               return -1; // Indicating stack is empty
          }
          return stack[top];
     }
     
     public boolean isEmpty() {
          return top == -1;
     }
     
     public boolean isFull() {
          return top == capacity - 1;
     }

     public int size() {
          return top + 1;
     }

     public void display() {
          if (isEmpty()) {
               System.out.println("Stack is empty");
               return;
          }
          System.out.print("Stack elements: ");
          for (int i = 0; i <= top; i++) {
               System.out.print(stack[i] + " ");
          }
          System.out.println();
     }
     //main with switch case for testing
     public static void main(String[] args) {
          StackOperations stack = new StackOperations(5);
         Scanner scanner = new java.util.Scanner(System.in);
          int choice, value;

          do {
               System.out.println("1. Push");
               System.out.println("2. Pop");
               System.out.println("3. Peek");
               System.out.println("4. Check if empty");
               System.out.println("5. Check if full");
               System.out.println("6. Display stack");
               System.out.println("7. Exit");
               System.out.print("Enter your choice: ");
               choice = scanner.nextInt();

               switch (choice) {
                    case 1:
                         System.out.print("Enter value to push: ");
                         value = scanner.nextInt();
                         stack.push(value);
                         break;
                    case 2:
                         int poppedValue = stack.pop();
                         if (poppedValue != -1) {
                              System.out.println("Popped value: " + poppedValue);
                         }
                         break;
                    case 3:
                         int peekedValue = stack.peek();
                         if (peekedValue != -1) {
                              System.out.println("Top value: " + peekedValue);
                         }
                         break;
                    case 4:
                         System.out.println("Is stack empty? " + stack.isEmpty());
                         break;
                    case 5:
                         System.out.println("Is stack full? " + stack.isFull());
                         break;
                    case 6:
                         stack.display();
                         break;
                    case 7:
                         System.out.println("Exiting...");
                         break;
                    default:
                         System.out.println("Invalid choice, please try again.");
               }
          } while (choice != 7);

          scanner.close();
     }
}
