class Solution {
    public int firstUniqChar(String s) {
        
        
        for(int i =0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            boolean duplicate = false;
            for(int j = 0 ; j < s.length() ; j++){
                if( i != j &&c == s.charAt(j)){
                    duplicate = true;
                    break;
                }
                
            }
            if(duplicate == false){
                return i;
            }
        }

       return -1;








    }
}