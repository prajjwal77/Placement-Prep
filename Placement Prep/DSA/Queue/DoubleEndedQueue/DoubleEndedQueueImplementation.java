package Queue.DoubleEndedQueue;

public class DoubleEndedQueueImplementation {
     private int[] queue;
     private int front, rear, size, capacity;
     
     public DoubleEndedQueueImplementation(int capacity) {
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
     
     public void enqueueFront(int item) {
          if (isFull()) {
               throw new RuntimeException("Queue is full");
          }
          front = (front - 1 + capacity) % capacity; // Circular decrement
          queue[front] = item;
          size++;
     }
     
     public void enqueueRear(int item) {
          if (isFull()) {
               throw new RuntimeException("Queue is full");
          }
          rear = (rear + 1) % capacity; // Circular increment
          queue[rear] = item;
          size++;
     }
     
     public int dequeueFront() {
          if (isEmpty()) {
               throw new RuntimeException("Queue is empty");
          }
          int item = queue[front];
          front = (front + 1) % capacity; // Circular increment
          size--;
          return item;
     }
     
     public int dequeueRear() {
          if (isEmpty()) {
               throw new RuntimeException("Queue is empty");
          }
          int item = queue[rear];
          rear = (rear - 1 + capacity) % capacity; // Circular decrement
          size--;
          return item;
     }
     
     public int peekFront() {
          if (isEmpty()) {
               throw new RuntimeException("Queue is empty");
          }
          return queue[front];
     }
     
     public int peekRear() {
          if (isEmpty()) {
               throw new RuntimeException("Queue is empty");
          }
          return queue[rear];
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
          DoubleEndedQueueImplementation deque = new DoubleEndedQueueImplementation(5);
          
          deque.enqueueRear(10);
          deque.enqueueRear(20);
          deque.enqueueFront(5);
          deque.display(); // Output: Queue elements: 5 10 20 
          
          System.out.println("Front element: " + deque.peekFront()); // Output: 5
          System.out.println("Rear element: " + deque.peekRear()); // Output: 20
          
          deque.dequeueFront();
          deque.display(); // Output: Queue elements: 10 20 
          
          deque.dequeueRear();
          deque.display(); // Output: Queue elements: 10 
     }
}
