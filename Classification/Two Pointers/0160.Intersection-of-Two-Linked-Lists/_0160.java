package two_points;

public class _0160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode a = headA, b = headB;
        while(a != null) {
        	lenA ++;
        	a = a.next;
        }
        while(b != null) {
        	lenB ++;
        	b = b.next;
        }
        if(lenA > lenB) {
        	int n = lenA - lenB;
        	while(n -- > 0) headA = headA.next;
        }
        else if(lenA < lenB) {
        	int n = lenB - lenA;
        	while(n -- > 0) headB = headB.next;
        }
        while(headA != null) {
        	if(headA == headB) return headA;
        	headA = headA.next;
        	headB = headB.next;
        }
        return null;
    }
}