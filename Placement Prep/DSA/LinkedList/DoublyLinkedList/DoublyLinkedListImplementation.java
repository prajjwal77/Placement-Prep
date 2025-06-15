public class DoublyLinkedListImplementation {
     static class Node {
         int data;
         Node next;
         Node prev;

         public Node(int data) {
             this.data = data;
             this.next = null;
             this.prev = null;
         }
     }
     static class DoublyLinkedList {
         private Node head;
         private Node tail;

         public DoublyLinkedList() {
             this.head = null;
             this.tail = null;
         }

         public void insertAtBeginning(int data) {
             Node newNode = new Node(data);
             if (head == null) {
                 head = newNode;
                 tail = newNode;
             } else {
                 newNode.next = head;
                 head.prev = newNode;
                 head = newNode;
             }
         }

         public void insertAtEnd(int data) {
             Node newNode = new Node(data);
             if (tail == null) {
                 head = newNode;
                 tail = newNode;
             } else {
                 tail.next = newNode;
                 newNode.prev = tail;
                 tail = newNode;
             }
         }

         public void displayForward() {
             Node current = head;
             while (current != null) {
                 System.out.print(current.data + " ");
                 current = current.next;
             }
             System.out.println();
         }

         public void displayBackward() {
             Node current = tail;
             while (current != null) {
                 System.out.print(current.data + " ");
                 current = current.prev;
             }
             System.out.println();
         }
     }


     public static void main(String[] args) {
           DoublyLinkedList dll = new DoublyLinkedList();
           dll.insertAtBeginning(10);
           dll.insertAtBeginning(20);
           dll.insertAtEnd(30);
           dll.insertAtEnd(40);
     
           System.out.print("Forward: ");
           dll.displayForward(); // Output: 20 10 30 40 
     
           System.out.print("Backward: ");
           dll.displayBackward(); // Output: 40 30 10 20
     }
}
