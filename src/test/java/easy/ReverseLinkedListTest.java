package easy;

import org.junit.Test;

import module.ListNode;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    ReverseLinkedList r = new ReverseLinkedList();

    @Test
    public void reverseList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode reverseList = r.reverseList(head);
        print(reverseList);
    }

    public void print(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}