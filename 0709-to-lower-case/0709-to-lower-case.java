class Solution {
    public String toLowerCase(String s) {

        char ch[] = s.toCharArray();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if( c >= 'A' && c <= 'Z'){
                ch[i] = ((char)(c+32));
            }

        }

        String ans = new String(ch);
        return ans;
    }
}