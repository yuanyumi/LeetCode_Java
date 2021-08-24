package two_points;

public class _0142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode l = head, r = head;
        do {
        	int n = 2;
        	while(n -- > 0) {
        		r = r.next;
        		if(r == null) return null;
        	}
        	l = l.next;
        	if(l == r) {
        		while(true) {
        			if(head == l) return l;
            		head = head.next;
            		l = l.next;
        		}
        	}
        }while(true);
    }
}