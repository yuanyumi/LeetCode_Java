package two_points;

import java.util.ArrayList;
import java.util.List;

public class _0438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0438 {
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> ans = new ArrayList<>();
    	int n = p.length();
    	for(int i = 0; i <= s.length() - n; i ++) {
    		if(see(s.substring(i, i + n), p)) ans.add(i);
    	}
    	
    	return ans;
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