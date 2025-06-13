public class CircularList {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = null;
          }
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

     }
}
