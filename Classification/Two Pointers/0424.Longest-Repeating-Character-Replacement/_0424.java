package two_points;

public class _0424 {

}
class Solution {
    public int characterReplacement(String s, int k) {
    	if(s.length() == 0) return 0;
    	int l = 0, r = 1, ans = 1;
    	int[] letter = new int[26];
    	letter[s.charAt(0) - 'A'] = 1;
    	while(r < s.length()) {
    		letter[s.charAt(r) - 'A'] += 1;
    		if(see(letter, k)) {
    			r ++;
    		}else {
    			ans = Math.max(ans, r - l);
    			letter[s.charAt(l) - 'A'] -= 1;
    			l ++;
    		}
    	}
    	return ans;
    }

	private boolean see(int[] letter, int k) {
		int max = 0, sum = 0;
		for(int i = 0; i < letter.length; i ++) {
			max = Math.max(max, letter[i]);
			sum += letter[i];
		}
		return k >= sum - max;
	}
}