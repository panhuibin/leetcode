package medium;

import org.junit.Test;

public class AddTwoNumbersTest {
    AddTwoNumbers a = new AddTwoNumbers();

    @Test
    public void addTwoNumbers() {
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
        sum.print();
    }
}