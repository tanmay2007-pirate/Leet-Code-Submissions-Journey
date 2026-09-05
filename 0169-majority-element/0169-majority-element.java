import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);

        int n = (nums.length / 2)+1 ;

        int num = nums[0];

        int count=0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(num == nums[i]){
                count++;
                if(count == n){
                    return nums[i];
                }
            }else{
                count = 1;
                num = nums[i];
            }
          
        }

        return 0;

    }
}