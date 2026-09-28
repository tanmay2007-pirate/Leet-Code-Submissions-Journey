class Solution {
    public double myPow(double x, long n) {
        
        long longn = n;

        if(n <0 ){
            x = 1/x;
            longn = -longn;
        }

        return powerhelper(x,longn);
        
    }
    public double powerhelper(double x , long n){
         
         // base case
        if(n == 0){
            return 1;
        }
        double powe =  myPow(x , n/2);
        if(n % 2 == 0){
            return powe*powe;
        }else{
            return x*powe*powe;
        }

    }
}