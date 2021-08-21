package two_points;

import java.util.HashSet;
import java.util.Set;

public class _0003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
    	if(s.length() == 0) return 0;
    	int ans = 1;
    	int l = 0, r = 1;
    	Set<Character> set = new HashSet<>();
    	char[] c = s.toCharArray();
    	set.add(c[0]);
    	while(r < c.length) {
    		while(set.contains(c[r])) {
    			set.remove(c[l ++]);
    		}
    		set.add(c[r ++]);
    		ans = Math.max(ans, r - l);
    	}
    	
    	
    	return ans;
    }
}