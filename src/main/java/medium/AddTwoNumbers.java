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

class AddTwoNumbers {
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

    public static void main(String[] args) {
        //LinkedList l1 = new LinkedList();
        //LinkedList l2 = new LinkedList();

        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        l1.next.next.next = null;

        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(8);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = null;

        AddTwoNumbers self = new AddTwoNumbers();
        ListNode sum = self.addTwoNumbers(l1, l2);
        self.printListNode(sum);
    }

    private void printListNode(ListNode sum) {
        while(sum!=null){
            System.out.println(sum.val);
            sum = sum.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
