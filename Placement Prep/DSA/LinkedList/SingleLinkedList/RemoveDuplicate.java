public class RemoveDuplicate {
     static class Node {
          int data;
          Node next;
     
          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }
     
     public static Node removeDuplicates(Node head) {
          if (head == null || head.next == null) {
               return head; // List is empty or has one element
          }
     
          Node current = head;
          while (current != null && current.next != null) {
               if (current.data == current.next.data) {
                    // Skip the duplicate node
                    current.next = current.next.next;
               } else {
                    current = current.next; // Move to the next node
               }
          }
          return head;
     }
     
     public static void printList(Node head) {
          Node current = head;
          while (current != null) {
               System.out.print(current.data + " ");
               current = current.next;
          }
     }

     public static void main(String[] args) {
          Node head = new Node(1);
          head.next = new Node(1);
          head.next.next = new Node(2);
          head.next.next.next = new Node(3);
          head.next.next.next.next = new Node(3);
          
          System.out.println("Original List:");
          printList(head);
          
          head = removeDuplicates(head);
          
          System.out.println("\nList after removing duplicates:");
          printList(head);
     }
}
