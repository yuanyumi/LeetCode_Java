package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0093 {
	List<String> ans = new ArrayList<>();
	String[] ss = new String[4];
    public List<String> restoreIpAddresses(String s) {
    	dfs(s, 0);
    	return ans;
    }

	private void dfs(String s, int k) {
		if(k >= 4) {
			if(s.length() != 0) return;
			String cur = String.join(".", ss);
			ans.add(cur);
			return;
		}
		for(int i = 1; i <= 3 && i <= s.length(); i ++) {
			if(check(s.substring(0, i))) {
				ss[k] = s.substring(0, i);
				dfs(s.substring(i), k + 1);
			}
			
		}
	}

	private boolean check(String s) {
		if(s.startsWith("0") && s.length() > 1) return false;
		int n = Integer.parseInt(s);
		if(n > 255) return false;
		return true;
	}
}