class Solution {
    public String restoreString(String s, int[] indices) {
        
        char sc  [] = new char [s.length()];

        for(int i = 0 ; i < s.length() ; i++){

            sc[indices[i]] = s.charAt(i);

        }


        return new String(sc);






    }
}