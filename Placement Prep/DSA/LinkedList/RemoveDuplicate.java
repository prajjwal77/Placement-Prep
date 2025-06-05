public class RemoveDuplicate {
// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
     }

      public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
            // Example usage:
            RemoveDuplicate solution = new RemoveDuplicate();
            
            // Creating a linked list: 1 -> 1 -> 2 -> 3 -> 3
            ListNode head = solution.new ListNode(1);
            head.next = solution.new ListNode(1);
            head.next.next = solution.new ListNode(2);
            head.next.next.next = solution.new ListNode(3);
            head.next.next.next.next = solution.new ListNode(3);
     
            // Removing duplicates
            ListNode result = solution.deleteDuplicates(head);
     
            // Printing the result
            while (result != null) {
               System.out.print(result.val + " ");
               result = result.next;
            }
    }
}
