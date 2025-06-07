public class InsertATLast {
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

          public void insertAtLast(int data) {
               Node newNode = new Node(data); // Create a new node with the given data
               if (head == null) { // If the list is empty, set head to the new node
                    head = newNode;
                    return;
               }
               Node current = head;
               while (current.next != null) { // Traverse to the last node
                    current = current.next;
               }
               current.next = newNode; // Link the new node at the end of the list
          }

          public void display() {
               Node current = head;
               while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
               }
               System.out.println();
          }
     }
     public static void main(String[] args) {
          SingleLinkedList list = new SingleLinkedList();
          list.insertAtLast(10);
          list.insertAtLast(20);
          list.insertAtLast(30);
          list.insertAtLast(40);
          list.insertAtLast(50);
          list.display();
     }
}
