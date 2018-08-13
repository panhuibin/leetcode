package medium;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * Example:
 * <p>
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Note:
 * <p>
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */

public class SwapNodesPairs {
    public ListNode swapNodesInParis(ListNode listNode) {
        if (listNode == null) return null;
        ListNode headNode = listNode.next == null ? listNode : listNode.next;
        ListNode prevNode = null;
        ListNode currentNode1 = listNode;
        ListNode currentNode2 = listNode.next;
        while (currentNode1 != null && currentNode2 != null) {
            if (prevNode != null) {
                prevNode.next = currentNode2;
            }
            ListNode nextNode = currentNode2.next;
            currentNode2.next = currentNode1;

            currentNode1.next = nextNode;
            prevNode = currentNode1;
            currentNode1 = nextNode;
            currentNode2 = nextNode == null ? null : nextNode.next;

        }
        //set the last node's next to null otherwise there's a loop
        if (currentNode1 != null) {
            if(prevNode!=null) {
                prevNode.next = currentNode1;
                prevNode.next.next = null;
            }
        }else{
            prevNode.next = null;
        }
        return headNode;
    }
}
