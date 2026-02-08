class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // store next
            current.next = prev;              // reverse pointer
            prev = current;                   // move prev
            current = nextNode;               // move current
        }

        return prev; // new head
    }
}
