import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        
        int buyprice = prices[0];
        int maxprofit  = Integer.MIN_VALUE;
        for(int i = 0 ; i < prices.length ; i++){
            int profit = 0 ;
            if(buyprice < prices[i]){
                profit = prices[i] - buyprice;
            }else{
                buyprice = prices[i];
            }
            maxprofit = Math.max(profit , maxprofit);

        }
        return maxprofit;

    }
}