public class QueueImplementation {
     static class Queue {
        private int[] arr;
        private int front, rear, capacity;

        public Queue(int size) {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
        }
        

        public void enqueue(int item) {
            if (rear == capacity - 1) {
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = item;
        }

        public int dequeue() {
            if (front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front++];
        }

        public boolean isEmpty() {
            return front > rear;
        }

        public int peek() {
            if (front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

            public int size() {
               return rear - front + 1;
            }

            public void display() {
               if (isEmpty()) {
                   System.out.println("Queue is empty");
                   return;
               }
               for (int i = front; i <= rear; i++) {
                   System.out.print(arr[i] + " ");
               }
               System.out.println();
            }
     }
        public static void main(String[] args) {
               Queue queue = new Queue(5);
               queue.enqueue(10);
               queue.enqueue(20);
               queue.enqueue(30);
               queue.display(); // Output: 10 20 30 
     
               System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 10
               queue.display(); // Output: 20 30 
     
               System.out.println("Peek: " + queue.peek()); // Output: Peek: 20
               System.out.println("Size: " + queue.size()); // Output: Size: 2
     
               queue.enqueue(40);
               queue.enqueue(50);
               queue.display(); // Output: 20 30 40 50
     
               System.out.println("Is Queue Empty? " + queue.isEmpty()); // Output: Is Queue Empty? false
     
               queue.enqueue(60); // Output: Queue is full
        }
}
