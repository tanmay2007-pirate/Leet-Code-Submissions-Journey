class Solution {
    public int searchInsert(int[] nums, int target) {

        int fi = 0;
        int ei = nums.length -1 ;

        while(ei >= fi){

            int mid = fi +(ei - fi) / 2 ;

            if(nums[mid] == target){

                return mid;
            }
            else if(nums[mid] > target){
                ei = mid-1;
            }else{
                fi = mid +1;
            }

        }

        return fi;
    }
}