package easy;

import java.util.Stack;

import module.ListNode;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2
 * Output: false
 * Example 2:
 * <p>
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */

class PalindromLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> s = new Stack();
        ListNode node = head;
        int count =0;
        while(node!=null){
            s.push(node);
            node = node.next;
            count ++;
        }
        node = head;
        for(int i=0;i<count/2;i++){
            if(node.val != s.pop().val){
                return false;
            }
            node = node.next;
        }
        return true;
    }
}
