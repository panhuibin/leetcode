package medium;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * <p>
 * Given n will always be valid.
 * <p>
 * Follow up:
 * <p>
 * Could you do this in one pass?
 */

class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int index) {
        //when it's removing the only node
        if (head.next == null && index == 1) {
            return null;
        }

        ArrayList<ListNode> listNodes = new ArrayList();
        ListNode currentNode = head;
        while (currentNode != null) {
            listNodes.add(currentNode);
            if (listNodes.size() > index + 1) {
                listNodes.remove(0);
            }
            currentNode = currentNode.next;
        }
        //the index element is actually the head node
        if (listNodes.size() <= index) {

            if (listNodes.size() > 1) {
                // if there're more than 1 node, I can return non-empty stuff.
                return listNodes.get(1);
            } else {
                return null;
            }
        } else {
            //the index element is actually the last node
            if (listNodes.size() == 2) {
                listNodes.get(0).next = null;
            } else {
                listNodes.get(0).next = listNodes.get(2);
            }
        }
        return head;
    }

    public ListNode removeNthFromEndNotGood(ListNode head, int n) {
        ListNode currentNode = head;
        DualDirectionListNode prevNode = null;
        DualDirectionListNode currentDualNode = null;
        DualDirectionListNode headDualNode = null;

        // build dual direction node.
        while (currentNode != null) {
            currentDualNode = new DualDirectionListNode(currentNode.val);
            currentDualNode.next = new DualDirectionListNode(currentNode.next.val);
            if (prevNode == null) {
                currentDualNode.prev = null;
                headDualNode = currentDualNode;
            } else {
                currentDualNode.prev = prevNode;
            }
            prevNode = currentDualNode;
            currentNode = currentNode.next;
        }

        int index = 0;
        while (currentDualNode != null) {
            if (index < n) {
                currentDualNode = currentDualNode.prev;
                index++;
            } else {
                currentDualNode.prev.next = currentDualNode.next;
                currentDualNode.next.prev = currentDualNode.prev;
            }
        }

        currentDualNode = headDualNode;
        return null;

    }

}

class DualDirectionListNode {
    DualDirectionListNode prev;
    DualDirectionListNode next;
    int val;

    DualDirectionListNode(int x) {
        val = x;
    }
}
