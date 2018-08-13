package medium;

import org.junit.Test;

public class MergeKSortedListsTest {

    MergeKSortedLists m = new MergeKSortedLists();

    /**
     * * 1->4->5,
     * 1->3->4,
     * 2->6
     *
     * @throws Exception
     */
    @Test
    public void mergeKLists() throws Exception {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        l1.next.next.next = null;

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = null;

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        l3.next.next = null;

        ListNode[] l = {l1, l2, l3};
        ListNode mergedNode = m.mergeKLists(l);
        mergedNode.print();

    }

}