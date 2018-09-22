package medium;

import module.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * Note: Do not modify the linked list.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */

class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next ==null) return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=fast) {
            if (fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            return slow;
        }
        return null;
    }
}
