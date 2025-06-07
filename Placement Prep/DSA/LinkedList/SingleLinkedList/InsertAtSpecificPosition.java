public class InsertAtSpecificPosition {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }

     public static class SingleLinkedList {
          Node head;

          // Method to insert a new node at a specific position
          public void insertAtPosition(int data, int position) {
               Node newNode = new Node(data);
               if (position == 0) { // Insert at the beginning
                    newNode.next = head;
                    head = newNode;
                    return;
               }
               Node current = head;
               for (int i = 0; i < position - 1 && current != null; i++) {
                    current = current.next; // Traverse to the node before the desired position
               }
               if (current == null) { // If position is greater than the length of the list, do nothing
                    System.out.println("Position out of bounds. Insertion failed.");
                    return;
               }
               newNode.next = current.next; // Link the new node to the next node
               current.next = newNode; // Link the previous node to the new node
          }

          public void display() {
               Node current = head;
               while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
               }
               System.out.println();
          }

          public void insertAtLast(int data) {
               Node newNode = new Node(data);
               if (head == null) {
                    head = newNode;
                    return;
               }
               Node current = head;
               while (current.next != null) {
                    current = current.next;
               }
               current.next = newNode;
          }
     }
     public static void main(String[] args) {
          SingleLinkedList list = new SingleLinkedList();
          list.insertAtLast(10);
          list.insertAtLast(20);
          list.insertAtLast(30);
          list.insertAtLast(40);
          list.insertAtLast(50);
          System.out.println("Original List:");
          list.display();

          // Insert at specific positions
          list.insertAtPosition(25, 2); // Insert 25 at position 2
          System.out.println("After inserting 25 at position 2:");
          list.display();

          list.insertAtPosition(5, 0); // Insert 5 at position 0 (beginning)
          System.out.println("After inserting 5 at position 0:");
          list.display();

          list.insertAtPosition(60, 5); // Insert 60 at position 5 (end)
          System.out.println("After inserting 60 at position 5:");
          list.display();
     }
}
