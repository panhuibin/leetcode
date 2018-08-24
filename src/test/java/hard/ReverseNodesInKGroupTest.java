package hard;

import module.ListNode;
import org.junit.Test;

public class ReverseNodesInKGroupTest {

    ReverseNodesInKGroup r = new ReverseNodesInKGroup();

    @Test
    public void reverseKGroup() throws Exception {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = new ListNode(6);
        l.next.next.next.next.next.next = new ListNode(7);
        l.next.next.next.next.next.next.next = new ListNode(8);
        l.next.next.next.next.next.next.next.next = new ListNode(9);
        l.next.next.next.next.next.next.next.next.next = new ListNode(10);
        l = r.reverseKGroup(l, 4);
        l.print();
    }

    @Test
    public void reverseKGroup2() throws Exception {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = new ListNode(6);
        l.next.next.next.next.next.next = new ListNode(7);
        l.next.next.next.next.next.next.next = new ListNode(8);
        l.next.next.next.next.next.next.next.next = new ListNode(9);
        l.next.next.next.next.next.next.next.next.next = new ListNode(10);
        l = r.reverseKGroup(l, 10);
        l.print();
    }

    @Test
    public void reverseKGroup3() throws Exception {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        l = r.reverseKGroup(l, 3);
        l.print();
    }

    @Test
    public void reverseKGroup4() throws Exception {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l = r.reverseKGroup(l, 3);
        l.print();
    }

}