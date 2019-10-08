package easy;

import module.ListNode;

class RemoveDuplicatesFromSortedList     {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        ListNode list = head;

        while(list.next != null){
            if(prev.val != list.next.val){
                prev.next = list.next;
                prev = prev.next;
                list = list.next;
            }else{
                list = list.next;
            }

        }
        prev.next = null;
        return head;
    }
}
