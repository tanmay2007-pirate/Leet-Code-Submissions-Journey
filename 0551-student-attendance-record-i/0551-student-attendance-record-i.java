class Solution {
    public boolean checkRecord(String s) {
        
        int rec [] = new int[2];

        //  first box A, second L , THird P

        for(int i = 0 ; i < s.length() ; i++){

            if(rec[1] == 3){
                break;
            }
            if(s.charAt(i) == 'A'){
                rec[0]++;
                rec[1] = 0;
            }else if(s.charAt(i)=='L'){
                rec[1]++;
            }else {
                rec[1] = 0;
            }
        }

        if(rec[0] < 2 && rec[1] < 3){
            return true;
        }



        return false;


    }
}