package two_points;

public class _0457 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0457 {
    public boolean circularArrayLoop(int[] nums) {
		int i,j,n=nums.length,time;
        for(i=0;i<n;i++) {
        	if((i+nums[i]%n+n)%n==i)continue;
        	j=(i+nums[i]%n+n)%n;
        	if(nums[j]*nums[i]<=0)continue;
        	time=n;
        	while(time-->0) {
        		j=(j+nums[j]%n+n)%n;
        		if(nums[j]*nums[i]<=0)break;
        		if(j==i)return true;
        	}
        }
		return false;
    }
}