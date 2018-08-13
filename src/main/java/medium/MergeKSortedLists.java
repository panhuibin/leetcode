package medium;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode headNode = null;
        ListNode prevNode = null;
        ListNode currentNode;

        ListNode minValueNode = null;
        while (true) {
            int minValueIndex = -1;
            boolean isAllNodeEmpty = true;
            int currentValue = Integer.MAX_VALUE;
            // find the node that contains the min value
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    isAllNodeEmpty = false;
                    ListNode node = lists[i];
                    if (node.val <= currentValue) {
                        minValueNode = node;
                        minValueIndex = i;
                    }
                    currentValue = Math.min(node.val, currentValue);
                }
            }

            //if all nodes are empty don't do anything
            if (isAllNodeEmpty) break;

            lists[minValueIndex] = minValueNode.next;
            currentNode = minValueNode;
            if (prevNode != null) prevNode.next = currentNode;
            if (headNode == null) headNode = currentNode;
            prevNode = currentNode;

        }

        return headNode;
    }
}
