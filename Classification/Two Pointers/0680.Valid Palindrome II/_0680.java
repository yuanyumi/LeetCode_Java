package two_points;

public class _0680 {

	public static void main(String[] args) {
		Solution0680 a = new Solution0680();
		System.out.println(a.validPalindrome("abca"));
	}

}
class Solution0680 {
    public boolean validPalindrome(String s) {
    	char[] c = s.toCharArray();
    	int i = 0, j = c.length - 1;
    	return go(i,j,c,1);
    }

	private boolean go(int i, int j, char[] c, int k) {
		if(i >= j) return true;
		if(c[i] == c[j]) return go(i + 1, j - 1, c, k);
		else if(k < 1) return false;
		else {
			k --;
			return go(i + 1, j, c, k) || go(i, j - 1, c, k);
		}
	}
}