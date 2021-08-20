package two_points;

public class _0082 {

	public static void main(String[] args) {
		ListNode a = new ListNode(0, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3))))));
//		System.out.print(a.next == null);
		Solution0082 b = new Solution0082();
		System.out.println(b.deleteDuplicates(a));
	}

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution0082 {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode hair = new ListNode();
    	hair.next = head;
    	ListNode cur = hair;
    	while(true) {
    		if(cur.next == null) return hair.next;
    		if(check(cur.next)) {
    			ListNode q = cur.next;
    			while(q.next.val == q.val) {
                    q = q.next;
    				if(q.next == null) break;
                }
    			q = q.next;
    			cur.next = q;
    		}else {
    			cur = cur.next;
    		}
    	}
    }

	private boolean check(ListNode n) {
		if(n.next == null) return false;
		if(n.next.val == n.val) return true;
		return false;
	}
}