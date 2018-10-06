package easy;

import org.junit.Assert;
import org.junit.Test;

import module.ListNode;

public class PalindromLinkedListTest {
    PalindromLinkedList p = new PalindromLinkedList();

    @Test
    public void isPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        Assert.assertEquals(true, p.isPalindrome(head));
    }
}