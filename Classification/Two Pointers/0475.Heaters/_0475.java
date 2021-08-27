package two_points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0475 {

	public static void main(String[] args) {
	}

}
class Solution0475 {
    public int findRadius(int[] houses, int[] heaters) {
    	Arrays.sort(houses);
    	Arrays.sort(heaters);
    	int l = 1, r = Integer.MAX_VALUE;
    	while(l < r) {
    		int mid = (l + r) / 2;
    		if(see(houses, heaters, mid)) {
    			r = mid;
    		}else l = mid + 1;
    	}
    	return l;
    }

	private boolean see(int[] houses, int[] heaters, int mid) {
		int index = 0;
		for(int i = 0; i < heaters.length; i ++) {
			int l = heaters[i] - mid, r = heaters[i] + mid; 
			while(houses[index] <= r && houses[index] >= l) {
				index ++;
				if(index == houses.length) return true;
			}
		}
		return false;
	}
}