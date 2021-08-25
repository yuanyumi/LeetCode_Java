package two_points;

public class _0234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0234 {
    public boolean isPalindrome(ListNode head) {
    	ListNode slow = head, fast = head, tail = head;
    	while(fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	while(tail.next != null) tail = tail.next;
    	reverse(slow, tail);
    	ListNode t = tail;
    	while(t != null) {
    		if(head.val != t.val) return false;
    		head = head.next;
    		t = t.next;
    	}
    	reverse(tail, slow);
    	return true;
    }

	private void reverse(ListNode p, ListNode tail) {
		if(p == tail) return;
		ListNode q = p.next, t = null;
		p.next = null;
		while(true) {
			if(q.next != null) t = q.next;
			q.next = p;
			p = q;
			if(p == tail) return;
			q = t;
		}
	}
}