import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
    
        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == val){
               
                nums[i] = 51;

                k++;
            }
        }
        Arrays.sort(nums);

        return n-k ;
        
    }
}