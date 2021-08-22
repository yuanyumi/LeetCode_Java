package two_points;

public class _0567 {

	public static void main(String[] args) {
		Solution x = new Solution();
		System.out.println(x.checkInclusion("ab", "eidbaooo"));
	}

}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
    	int n = s2.length();
    	for(int i = 0; i <= s1.length() - n; i ++) {
    		if(see(s1.substring(i, i + n), s2)) return true;
    	}
    	
    	return false;
    }

	private boolean see(String s, String p) {
		int[] as = new int[26];
		for(int i = 0; i < s.length(); i ++) {
			as[s.charAt(i) - 'a'] ++;
			as[p.charAt(i) - 'a'] --;
		}
		for(int i = 0; i < as.length; i ++) {
			if(as[i] != 0) return false;
		}
		return true;
	}
}