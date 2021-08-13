package two_points;

public class _0125 {

	public static void main(String[] args) {
		Solution125 test = new Solution125();
//		System.out.println(test.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(test.isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
	}

}
class Solution125 {
    public boolean isPalindrome(String s) {
    	int i = 0, j = s.length() - 1;
    	while(i < j) {
    		while(notValid(s.charAt(i))) {
    			i ++;
    			if(i >= j) return true;
    		}
    		while(notValid(s.charAt(j))) {
    			j --;
    			if(i >= j) return true;
    		}
    		if(s.charAt(i) == s.charAt(j)) {
    			i ++; 
        		j --;
        		continue;
    		}
    		if(s.charAt(i) < 65 || s.charAt(j) < 65) {
    			System.out.println(s.charAt(i));
    			System.out.println(s.charAt(j));
    			return false;
    		}
    		if(Math.abs(s.charAt(i) - s.charAt(j)) != 32) {
    			System.out.println(s.charAt(i));
    			System.out.println(s.charAt(j));
    			return false;
    		}
    		i ++;
    		j --;
    	}
    	return true;
    }

	private boolean notValid(char c) {
		if(48 <= c && c <= 57) return false;
		if(65 <= c && c <= 90) return false;
		if(97 <= c && c  <= 123) return false;
		return true;
	}
}