package medium;

/*
https://leetcode.com/problems/add-two-numbers/description/
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

import module.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ListNode previousNode = null;
        ListNode initialNode = null;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            ListNode sum = new ListNode((val1 + val2 + carryOver) % 10);
            carryOver = (val1 + val2 + carryOver) >= 10 ? 1 : 0;
            if (previousNode != null) {
                previousNode.next = sum;
            }
            previousNode = sum;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if (initialNode == null) {
                initialNode = previousNode;
            }
        }

        if (carryOver == 1) {
            ListNode sum = new ListNode(1);
            if (previousNode != null) {
                previousNode.next = sum;
            }
            previousNode = sum;
        }

        previousNode.next = null;
        return initialNode;
    }

}


