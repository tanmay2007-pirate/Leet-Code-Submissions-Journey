class Solution {
    public int addDigits(int num) {
        
        int sum = add1( num);

        while(sum > 9){
            int temp = sum;
            sum = add1(temp);

        }

        return sum;


    }

    public int add1(int num){

        int sum = 0;
         while(num > 0){

            int digit = num % 10;
            sum+= digit;
            num /= 10;
        }
        return sum;

    }
}