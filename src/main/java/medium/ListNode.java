package medium;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void print(){
        ListNode current = this;
        while(current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }

}
