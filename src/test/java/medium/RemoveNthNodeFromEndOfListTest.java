package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList r = new RemoveNthNodeFromEndOfList();

    @Test
    public void removeNthFromEnd() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = null;

        ListNode l2 = r.removeNthFromEnd(l1,2);
        l2.print();

        ListNode l3 = r.removeNthFromEnd(l2, 4);
        l3.print();

        ListNode l4 = r.removeNthFromEnd(l3, 3);
        l4.print();

        ListNode l5 = r.removeNthFromEnd(l4, 1);
        l5.print();

        ListNode l6 = r.removeNthFromEnd(l5, 1);
        System.out.println(l6);

    }
}