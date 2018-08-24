package easy;

import module.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headNode = null;
        ListNode currentNode;
        ListNode prevNode = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currentNode = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                currentNode = new ListNode(l2.val);
                l2 = l2.next;
            }
            if (headNode == null) {
                headNode = currentNode;
            }
            if (prevNode != null) {
                prevNode.next = currentNode;
            }
            prevNode = currentNode;
        }

        if (l1 != null) {
            if(prevNode==null) return l1;
            prevNode.next = l1;
        } else if (l2 != null) {
            if(prevNode==null) return l2;
            prevNode.next = l2;
        }
        return headNode;
    }
}
