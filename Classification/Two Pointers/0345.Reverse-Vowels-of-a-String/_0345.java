package two_points;

public class _0345 {

	public static void main(String[] args) {
		Solution0345 a = new Solution0345();
		System.out.println(a.reverseVowels("hello"));
	}

}
class Solution0345 {
    public String reverseVowels(String s) {
    	char[] c = s.toCharArray();
    	int i = 0, j = s.length() - 1;
    	while(i < j) {
    		while(notValid(c[i]) && i < j) i ++;
    		while(notValid(c[j]) && i < j) j --;
    		char t = c[i]; c[i] = c[j]; c[j] = t;
    		i ++; j --;
    	}
    	String ans = "";
    	for(Character ch:c) ans += ch;
    	return ans;
    }

	private boolean notValid(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return false;
		return true;
	}
}