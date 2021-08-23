package two_points;

import java.util.Arrays;

public class _0088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i <= m + n - 1; i ++) {
        	nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    
    }
}