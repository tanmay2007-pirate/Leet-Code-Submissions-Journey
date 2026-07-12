import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int ans [] =  new int[n];
        int si = 0 ;
        int ei = n-1;
        int k = n-1;

        while(si <= ei){
            if(Math.abs(nums[si]) > Math.abs(nums[ei])){
                ans[k] = nums[si] * nums[si] ;
                si++; 
            }else{
                ans[k] = nums[ei] * nums[ei];
                ei--;
            }
            k--;

        }

        return ans;


    }
}