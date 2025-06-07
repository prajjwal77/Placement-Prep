public class InsertAtFirst {
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

          public void insertAtFirst(int data) {
               Node newNode = new Node(data);// Create a new node with the given data
               if (head == null) {// If the list is empty, set head to the new node
                    head = newNode;
                    return;
               }
               newNode.next = head;// Link the new node to the previous head
               head = newNode;// Update head to point to the new node
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
            list.insertAtFirst(10);
            list.insertAtFirst(20);
            list.insertAtFirst(30);
            list.insertAtFirst(40);
            list.insertAtFirst(50);
            list.display();
     }
}
