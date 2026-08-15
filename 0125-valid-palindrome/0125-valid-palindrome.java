import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        String a_l = s.toLowerCase();

        for(int i = 0 ; i < s.length() ; i++){
            if((a_l.charAt(i) >= 0 && a_l.charAt(i) <= 47) || (a_l.charAt(i) >= 58 && a_l.charAt(i) <= 64) ||(a_l.charAt(i) >= 91 && a_l.charAt(i) <= 96) || (a_l.charAt(i) >= 123 && a_l.charAt(i) <= 127)   ){
                continue;

            }else{
                sb.append(a_l.charAt(i));
            }
        }


        int lp = 0 ;
        int rp = sb.length() -1;

        while(lp < rp){
            if(sb.charAt(lp) != sb.charAt(rp) ){
                return false;
            }
            lp++;
            rp--;
        }

        return true;

    }
}