package medium;

import org.junit.Test;

import module.ListNode;

import static org.junit.Assert.*;

public class SortListTest {
    SortList s = new SortList();

    @Test
    public void sortList1() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        s.sortList(head);
    }
}