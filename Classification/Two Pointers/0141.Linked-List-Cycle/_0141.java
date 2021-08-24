package two_points;

public class _0141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode l = head, r = head;
        do {
        	int n = 2;
        	while(n -- > 0) {
        		r = r.next;
        		if(r == null) return false;
        	}
        	l = l.next;
        	if(r == l)return true;
        }while(true);
    }
}