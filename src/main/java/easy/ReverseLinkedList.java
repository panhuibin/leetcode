package easy;

import java.util.Stack;

import module.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        Stack<ListNode> s = new Stack();
        while(head!=null){
            s.push(head);
            head = head.next;
        }
        ListNode temp = s.pop();
        head = temp;
        while(!s.isEmpty()){
            ListNode next = s.pop();
            temp.next = next;
            temp = next;
        }
        temp.next = null;
        return head;
    }
}
