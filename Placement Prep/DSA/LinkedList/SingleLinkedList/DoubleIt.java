
import com.sun.tools.javac.Main;

public class DoubleIt {
     static class Node{
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }
     //method to double the element of the list
     //example 1 : 1 -> 8 -> 9  ---> 3 -> 7 -> 8
     //example 2 : 9 -> 9 -> 9  ---> 1 -> 9 -> 9 ->8
     public static Node doubleIt(Node head) {
        head = reverseList(head);

        Node current = head;
        int carry = 0;

        while (current != null) {
            int doubled = current.data * 2 + carry;// Double the current node's value and add carry
            current.data = doubled % 10;// Update the current node's value with the last digit of doubled
            carry = doubled / 10;// Calculate the carry for the next node

            if (current.next == null && carry > 0) {
                current.next = new Node(0); // Add dummy node for further carry
            }

            current = current.next;
        }

        head = reverseList(head);

        // If carry remains after reversal (e.g., leading 1), handle it
        if (head.data == 0 && head.next != null) {
            Node newHead = new Node(1);
            newHead.next = head;
            head = newHead;
        }

        return head;
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

     // Method to print the linked list
     public static void printList(Node head) {
          Node current = head;
          while (current != null) {
               System.out.print(current.data + " ");
               current = current.next;
          }
          System.out.println();
     }

     public static void main(String[] args) {
          Node head = new Node(9);
          head.next = new Node(9);
          head.next.next = new Node(9);
     

          System.out.println("Original List:");
          printList(head);

          head = doubleIt(head);

          System.out.println("List after doubling each element:");
          printList(head);
     }
}
