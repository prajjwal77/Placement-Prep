
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveRepeatingElement {
     public static ListNode deleteAllDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            boolean isDuplicate = false;
            while (current.next != null && current.val == current.next.val) {
                isDuplicate = true;
                current = current.next;
            }

            if (isDuplicate) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }

        return dummy.next;
    }

    //method to print list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        RemoveRepeatingElement solution = new RemoveRepeatingElement();
        ListNode result = solution.deleteAllDuplicates(head);

            solution.printList(result); // Output: 1 -> 3 -> 5
        
    }
}
