class Solution {
    public int sumOfMultiples(int n) {
        
        int sum = 0;
        int lp = 1;
        int rp = n;

        while(rp>=lp){
            if(lp%3 == 0 || lp%5 == 0 || lp%7==0){
                sum+= lp;
                
            }
            if((rp%3 == 0 || rp%5 == 0 || rp%7 == 0) && rp != lp){
                sum+= rp;
            }
            lp++;
            rp--;
        }

        // for(int i = 1 ; i <= n ; i++){
        //     if(i%3 == 0 || i%5 == 0 || i%7 == 0){
        //         sum+= i;
        //     }
        // }


        return sum;
    }
}