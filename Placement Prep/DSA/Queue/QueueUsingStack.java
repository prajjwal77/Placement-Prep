package Queue;
import java.util.Stack;


public class QueueUsingStack {
     //Queue implementation using two stacks
     private Stack<Integer> stack1;
     private Stack<Integer> stack2;
     private int size;
     public QueueUsingStack() {
         stack1 = new Stack<>();
         stack2 = new Stack<>();
         size = 0;
     }
     public void enqueue(int value) {
         stack1.push(value);
         size++;
     }
     public int dequeue() {
           if (size == 0) {
                throw new IllegalStateException("Queue is empty");
           }
           if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                     stack2.push(stack1.pop());
                }
           }
           size--;
           return stack2.pop();
      }
     public int peek() {
           if (size == 0) {
                throw new IllegalStateException("Queue is empty");
           }
           if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                     stack2.push(stack1.pop());
                }
           }
           return stack2.peek();
          }
     public boolean isEmpty() {
           return size == 0;
     }
     public int getSize() {
           return size;
     }
     @Override
     public String toString() {
           StringBuilder sb = new StringBuilder();
           sb.append("Queue: ");
           for (int i = stack2.size() - 1; i >= 0; i--) {
                sb.append(stack2.get(i)).append(" ");
           }
           for (int i = 0; i < stack1.size(); i++) {
                sb.append(stack1.get(i)).append(" ");
           }
           return sb.toString().trim();
     } 

     public static void main(String[] args) {
           QueueUsingStack queue = new QueueUsingStack();
           queue.enqueue(1);
           queue.enqueue(2);
           queue.enqueue(3);
           System.out.println(queue); // Output: Queue: 1 2 3
           System.out.println(queue.dequeue()); // Output: 1
           System.out.println(queue.peek()); // Output: 2
           System.out.println(queue.getSize()); // Output: 2
           System.out.println(queue.isEmpty()); // Output: false
           System.out.println(queue); // Output: Queue: 2 3
     }

}
