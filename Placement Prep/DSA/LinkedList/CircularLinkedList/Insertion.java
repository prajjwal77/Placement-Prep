public class Insertion {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }
     // Method to insert a new node at the end of the circular linked list
     public static Node insertAtEnd(Node head, int data) {
          Node newNode = new Node(data);
          if (head == null) {
               newNode.next = newNode; // Point to itself
               return newNode;
          }
          Node current = head;
          while (current.next != head) {
               current = current.next;
          }
          current.next = newNode; // Link the last node to the new node
          newNode.next = head; // Point the new node to the head
          return head;
     }

     // Method to insert a new node at the beginning of the circular linked list
     public static Node insertAtBeginning(Node head, int data) {
          Node newNode = new Node(data);
          if (head == null) {
               newNode.next = newNode; // Point to itself
               return newNode;
          }
          Node current = head;
          while (current.next != head) {
               current = current.next;
          }
          current.next = newNode; // Link the last node to the new node
          newNode.next = head; // Point the new node to the old head
          return newNode; // New node is now the head
     }
     //print the circular linked list
     public static void printCircularList(Node head) {
          if (head == null) return;
          Node current = head;
          do {
               System.out.print(current.data + " ");
               current = current.next;
          } while (current != head);
          System.out.println();
     }
     public static void main(String[] args) {
          Node head = new Node(1);
          head.next = new Node(2);
          head.next.next = new Node(3);
          head.next.next.next = head; // Making it circular

          System.out.println("Original Circular List:");
          printCircularList(head);

          // Inserting a new node with value 4 at the end
          head = insertAtEnd(head, 4);
          System.out.println("After inserting 4 at the end:");
          printCircularList(head);

          // Inserting a new node with value 0 at the beginning
          head = insertAtBeginning(head, 0);
          System.out.println("After inserting 0 at the beginning:");
          printCircularList(head);
     }
}
