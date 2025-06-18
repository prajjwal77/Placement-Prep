package Queue.CircularQueue;

public class CircularQueueImplementation {
     private int[] queue;
     private int front, rear, size, capacity;
     
     public CircularQueueImplementation(int capacity) {
          this.capacity = capacity;
          this.queue = new int[capacity];
          this.front = 0;
          this.size = 0;
          this.rear = capacity - 1; // Rear is initialized to the last index
     }
     
     public boolean isFull() {
          return size == capacity;
     }
     
     public boolean isEmpty() {
          return size == 0;
     }
     
     public void enqueue(int item) {
          if (isFull()) {
               throw new RuntimeException("Queue is full");
          }
          rear = (rear + 1) % capacity; // Circular increment
          queue[rear] = item;
          size++;
     }
     
     public int dequeue() {
          if (isEmpty()) {
               throw new RuntimeException("Queue is empty");
          }
          int item = queue[front];
          front = (front + 1) % capacity; // Circular increment
          size--;
          return item;
     }
     
     public int peek() {
          if (isEmpty()) {
               throw new RuntimeException("Queue is empty");
          }
          return queue[front];
     }
     
     public int getSize() {
          return size;
     }
     public void display() {
          if (isEmpty()) {
               System.out.println("Queue is empty");
               return;
          }
          System.out.print("Queue elements: ");
          for (int i = 0; i < size; i++) {
               System.out.print(queue[(front + i) % capacity] + " ");
          }
          System.out.println();
     }
     public static void main(String[] args) {
          CircularQueueImplementation circularQueue = new CircularQueueImplementation(5);
          
          circularQueue.enqueue(10);
          circularQueue.enqueue(20);
          circularQueue.enqueue(30);
          circularQueue.display(); // Output: Queue elements: 10 20 30 
          
          System.out.println("Dequeued: " + circularQueue.dequeue()); // Output: Dequeued: 10
          circularQueue.display(); // Output: Queue elements: 20 30 
          
          circularQueue.enqueue(40);
          circularQueue.enqueue(50);
          circularQueue.display(); // Output: Queue elements: 20 30 40 50 
          
          System.out.println("Peek: " + circularQueue.peek()); // Output: Peek: 20
     }
}
