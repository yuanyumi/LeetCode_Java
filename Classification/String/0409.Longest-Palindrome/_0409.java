package string;

public class _0409 {

	public static void main(String[] args) {
		Solution409 test = new Solution409();
		System.out.println(test.longestPalindrome("abccccdd"));
	}

}
class Solution409 {
    public int longestPalindrome(String s) {
    	int[] bigLetter = new int[26];
    	int[] smallLetter = new int[26];
    	for(int i = 0; i < s.length(); i ++) {
    		char c = s.charAt(i);
    		if(c - 65 >= 0 && 90 - c >= 0) bigLetter[c - 65] += 1;
    		if(c - 97 >= 0 && 123 - c >= 0) smallLetter[c - 97] += 1;
    	}
    	int ans = 0;
    	boolean plusOne = false;
    	for(Integer i : bigLetter) {
    		if(i % 2 == 0) ans += i;
    		else {
    			plusOne = true;
    			ans += i / 2 * 2;
    		}
    	}
    	for(Integer i : smallLetter) {
    		if(i % 2 == 0) ans += i;
    		else {
    			plusOne = true;
    			ans += i / 2 * 2;
    		}
    	}
    	if(plusOne) ans += 1;
    	return ans;
    }
}