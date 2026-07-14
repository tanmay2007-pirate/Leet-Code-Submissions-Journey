class Solution {
    public boolean isPalindrome(int x) {
        
        

        if(x<0){
            return false;
        }

        
        int revnum = 0;
        int num = x;
        while(x > 0){

            int last_digit = x % 10;

            revnum = revnum * 10 + last_digit;

            x /= 10;

            


        }

        

        return revnum == num ;
    }
}