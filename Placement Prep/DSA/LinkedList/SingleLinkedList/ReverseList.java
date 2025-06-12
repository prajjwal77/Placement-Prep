public class ReverseList {

     // Node class representing each element in the linked list
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }
     // SingleLinkedList class to manage the linked list
     static class SingleLinkedList {
          Node head;

          // Method to add a new node at the end of the list
          public void add(int data) {
               Node newNode = new Node(data);
               if (head == null) {
                    head = newNode;
               } else {
                    Node current = head;
                    while (current.next != null) {
                         current = current.next;
                    }
                    current.next = newNode;
               }
          }

          // Method to reverse the linked list
          public void reverse() {
               Node prev = null;
               Node current = head;
               Node next = null;

               while (current != null) {
                    next = current.next; // Store next node
                    current.next = prev; // Reverse the link
                    prev = current; // Move prev to current
                    current = next; // Move to next node
               }
               head = prev; // Update head to the new first node
          }


          // Method to print the linked list
          public void printList() {
               Node current = head;
               while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
               }
               System.out.println();
          }
     }
     public static void main(String[] args) {
          // Example usage
          SingleLinkedList list = new SingleLinkedList();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);

          System.out.println("Original List:");
          list.printList();

          list.reverse();

          System.out.println("Reversed List:");
          list.printList();
     }
}
