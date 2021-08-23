package two_points;

public class _0083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0083 {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode hair = new ListNode(), cur = head, q = head;
    	hair.next = head;
    	while(cur != null) {
    		while(cur.next != null && cur.next.val == cur.val) {
    			cur = cur.next;
    		}
    		q.next = cur.next;
            cur = cur.next;
    		q = q.next;
    	}
    	
    	
    	return hair.next;
    }
}