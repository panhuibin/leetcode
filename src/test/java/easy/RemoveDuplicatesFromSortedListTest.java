package easy;

import org.junit.Assert;
import org.junit.Test;

import module.ListNode;

public class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();

    @Test
    public void  test(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;


        ListNode result = r.deleteDuplicates(l1);


        Assert.assertEquals(result, l1);
        Assert.assertEquals(result.next, l3);
    }

    @Test
    public void  test2(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;


        ListNode result = r.deleteDuplicates(l1);


        Assert.assertEquals(result, l1);
        Assert.assertEquals(result.next, l3);
        Assert.assertEquals(result.next.next, l4);
        Assert.assertEquals(result.next.next.next, null);
    }
}
