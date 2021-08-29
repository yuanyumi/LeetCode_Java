package DFS;

import java.util.ArrayList;
import java.util.List;

public class _0017 {

	public static void main(String[] args) {
		Solution0017 w = new Solution0017();
		System.out.println(w.letterCombinations("23"));
	}

}
class Solution0017 {
	List<String> ans = new ArrayList<>();
	char[][] a = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public List<String> letterCombinations(String digits) {
    	go(digits, 0, "");
    	return ans;
    }

	private void go(String digits, int k, String s) {
		if(k >= digits.length()) {
			ans.add(s);
			return;
		}
		int cur = digits.charAt(k) - 50;
		String ss;
		for(int i = 0; i < a[cur].length; i ++) {
			ss = s + a[cur][i];
			go(digits, k + 1, ss);
		}
	}
}