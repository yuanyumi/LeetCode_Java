package two_points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int a,b,c,d;
        for(a=0;a<nums.length-3;a++) {
        	if(a>0&&nums[a]==nums[a-1])continue;
        	for(b=a+1;b<nums.length-2;b++) {
        		if(b>a+1&&nums[b]==nums[b-1])continue;
        		c=b+1;d=nums.length-1;
        		while(c<d) {
        			if(nums[a]+nums[b]+nums[c]+nums[d]<target) {
        				c++;
        			}
        			else if(nums[a]+nums[b]+nums[c]+nums[d]>target) {
        				d--;
        			}
        			else {
        				List<Integer> slist=new ArrayList<>();
        				slist.add(nums[a]);slist.add(nums[b]);slist.add(nums[c]);slist.add(nums[d]);
        				list.add(slist);
        				while(c<d&&nums[c+1]==nums[c])c++;
        				while(c<d&&nums[d-1]==nums[d])d--;
        				c++;d--;
        			}
        		}
        	}
        }
        
        return list;
		
		
    }
}