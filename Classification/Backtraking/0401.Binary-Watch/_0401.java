package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0401 {

	public static void main(String[] args) {
		Solution0401 a = new Solution0401();
		System.out.println(a.readBinaryWatch(1));
	}

}
class Solution0401 {
	boolean[] b = new boolean[10];
	List<String> ans = new ArrayList<>();
    public List<String> readBinaryWatch(int turnedOn) {
    	dfs(0, turnedOn);
    	return ans;
    }
	private void dfs(int k, int left) {
		if(left == 0) {
			int hour = 0, minute = 0;
			for(int i = 0; i < 4; i ++) {
				if(b[i]) hour += Math.pow(2, i);
			}
			if(hour >= 12) return;
			for(int i = 4; i < b.length; i ++) {
				if(b[i]) minute += Math.pow(2, i - 4);
			}
			if(minute >= 60) return;
			String s = "" + hour + ":";
			if(minute < 10) s += "0" + minute;
			else s += minute;
			ans.add(s);
			return;
		}
		if(k >= b.length) return;
		dfs(k + 1, left);
		b[k] = true;
		dfs(k + 1, left - 1);
		b[k] = false;
		
	}
}