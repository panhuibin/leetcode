package easy;

import module.ListNode;

class MinStack {

    ListNode head = null;

    public MinStack() {
    }

    public void push(int x) {
        ListNode n = new ListNode(x);
        n.next = head;
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        if(head!=null) {
            return head.val;
        }else{
            return 0;
        }
    }

    public int getMin() {
        if(head==null) return 0;
        int min = head.val;
        ListNode temp = head;
        while(temp!=null){
            min = Math.min(temp.val,min);
        }
        return min;
    }

}
