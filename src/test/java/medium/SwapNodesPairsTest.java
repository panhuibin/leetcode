package medium;

import org.junit.Test;

public class SwapNodesPairsTest {

    SwapNodesPairs s = new SwapNodesPairs();

    @Test
    public void swapNodesInParis() throws Exception {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        l = s.swapNodesInParis(l);
        l.print();
        System.out.println("============");
        l.next.next.next.next = null;
        l.print();
        System.out.println("============");
        l = s.swapNodesInParis(l);
        l.print();
        System.out.println("============");
        l.next.next=null;
        l.print();
        System.out.println("============");
        l = s.swapNodesInParis(l);
        l.print();
        System.out.println("============");
        l.next=null;
        l.print();
        System.out.println("============");
        l = s.swapNodesInParis(l);
        l.print();
        System.out.println("============");
    }

}