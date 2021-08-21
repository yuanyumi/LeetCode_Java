package two_points;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0187 {
    public List<String> findRepeatedDnaSequences(String s) {
    	int i = 0;
    	List<String> ans = new ArrayList<>();
    	Set<String> set = new HashSet<>();
    	while(i <= s.length() - 10) {
    		String ss = s.substring(i, i + 10);
    		if(!set.contains(ss)) set.add(ss);
    		else ans.add(ss);
    	}
    	return ans;
    }
}