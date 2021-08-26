package two_points;

public class _0328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0328 {
	public ListNode oddEvenList(ListNode head) {
    	if(head == null || head.next == null) return head;
    	ListNode odd = head, even = head.next, cur = head.next.next, o = odd, e = even;
    	int n = 1;
    	while(cur != null) {
    		if(n ++ % 2 == 1) {
    			o.next = cur;
    			o = o.next;
    		}else {
    			e.next = cur;
    			e = e.next;
    		}
    		cur = cur.next;
    	}
    	e.next = null;
    	o.next = even;
    	
    	return head;
    }
}