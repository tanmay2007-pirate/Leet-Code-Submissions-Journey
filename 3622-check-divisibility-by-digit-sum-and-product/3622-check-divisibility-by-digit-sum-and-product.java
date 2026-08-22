class Solution {
    public boolean checkDivisibility(int n) {
        
        int sumd = 0;
        int prodd = 1;
        int num = n;
        while(n>0){
            int digit = n%10;
            sumd+= digit;
            prodd*= digit;
            n /= 10;
        }
        int sum = sumd+prodd;
        if(sum == 0){
            return false;
        }
        else if (num % sum == 0 ){
            return true;
        }
        return false;
    }
}