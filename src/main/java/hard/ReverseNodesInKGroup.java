package hard;

import medium.ListNode;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * <p>
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * <p>
 * Example:
 * <p>
 * Given this linked list: 1->2->3->4->5
 * <p>
 * For k = 2, you should return: 2->1->4->3->5
 * <p>
 * For k = 3, you should return: 3->2->1->4->5
 * <p>
 * For k = 3, you should return: 4->3->2->1->8->7->6->5->9->10->11
 * Note:
 * <p>
 * Only constant extra memory is allowed.
 * You may not alter the values in the list's nodes, only nodes itself may be changed.
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) return head;
        ListNode newHead = null;
        ListNode currNode = head;
        ListNode prevNode = null;
        int count = 0;
        ListNode prevSectionStartNode = null;
        ListNode prevSectionEndNode = null;
        ListNode currSectionStartNode = null;
        ListNode currSectionEndNode = null;
        ListNode nextNode = currNode.next;
        while (currNode != null) {
            nextNode = currNode.next;
            //if this node is the start of the section
            if (count % k == 0) {
                //it's next should be ne nextSectionStartNode, but it's not set yet.
                currSectionStartNode = currNode;
                currNode.next = null;
            } else if (count % k == k - 1) {
                //if this node is the end of the section
                currSectionEndNode = currNode;
                if (prevSectionStartNode != null) prevSectionStartNode.next = currNode;
                prevSectionStartNode = currSectionStartNode;
                prevSectionEndNode = currSectionEndNode;
                currNode.next = prevNode;
                if (newHead == null) newHead = currNode;
            } else {
                currNode.next = prevNode;
            }

            prevNode = currNode;
            currNode = nextNode;
            count++;
        }
        /*
        4->3->2->1->8->7->6->5->null
        11->10->9->null
        */

        currNode = prevNode;
        //deal with the left over node
        if (count % k != 0) {
            prevNode = null;
            while (currNode != null) {
                nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            if (prevSectionStartNode != null)
                prevSectionStartNode.next = currSectionStartNode;
        }
        if (count < k) {
            return currSectionStartNode;
        } else {
            return newHead;
        }
    }
}
