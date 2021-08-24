package two_points;

public class _0143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0143 {
    public void reorderList(ListNode head) {
    	int n = 0;
    	ListNode q = head;
    	while(q != null) {
    		n ++;
    		q = q.next;
    	}
        ListNode[] l = new ListNode[n];
        q = head;
        int c = 0;
        while(q != null) {
        	l[c ++] = q;
        	q = q.next;
        }
        for(c = 0; c < n - 1 - c; c ++) {
        	l[c].next = l[n - 1 - c];
        	l[n - 1 - c].next = l[c + 1];
        } 
        l[c].next = null;
    }
}