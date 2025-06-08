public class SortLinkedlist {
     static class Node {
          int data;
          Node next;
     
          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }
     public static Node sortLinkedList(Node head) {
          if (head == null || head.next == null) {
               return head; // List is empty or has one element
          }
     
          Node mid = getMiddle(head);
          Node left = sortLinkedList(head);
          Node right = sortLinkedList(mid);
     
          return merge(left, right);
     }
     
     private static Node getMiddle(Node head) {
          if (head == null) {
               return null;
          }
          Node slow = head;
          Node fast = head.next;
     
          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }
          Node mid = slow.next;
          slow.next = null; // Split the list into two halves
          return mid;
     }
     
     private static Node merge(Node left, Node right) {
          if (left == null) {
               return right;
          }
          if (right == null) {
               return left;
          }
     
          if (left.data <= right.data) {
               left.next = merge(left.next, right);
               return left;
          } else {
               right.next = merge(left, right.next);
               return right;
          }
     }

     public static void printList(Node head) {
          Node current = head;
          while (current != null) {
               System.out.print(current.data + " ");
               current = current.next;
          }
          System.out.println();
     }

     public static void main(String[] args) {
          Node head = new Node(4);
          head.next = new Node(2);
          head.next.next = new Node(1);
          head.next.next.next = new Node(3);
          head.next.next.next.next = new Node(5);
          

     
          System.out.println("Original Linked List:");
          printList(head);
     
          head = sortLinkedList(head);
     
          System.out.println("Sorted Linked List:");
          printList(head);
     }
}
