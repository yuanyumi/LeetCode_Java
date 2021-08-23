package two_points;

public class _0086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0086 {
    public ListNode partition(ListNode head, int x) {
    	ListNode small = new ListNode(), big = new ListNode(), s, b;
    	s = small;
    	b = big;
    	while(head != null) {
    		if(head.val < x) {
    			s.next = head;
    			s = s.next;
    		}else if(head.val >= x) {
    			b.next = head;
    			b = b.next;
    		}
            head = head.next;
    	}
    	s.next = big.next;
        b.next = null;
    	return small.next;
    }
}