import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        
        int l = 0, r = s.length() - 1;

        while (l < r) {
            char a = s.charAt(l);
            char b = s.charAt(r);

            if (!((a >= 'a' && a <= 'z') ||
                  (a >= 'A' && a <= 'Z') ||
                  (a >= '0' && a <= '9'))) {
                l++;
                continue;
            }

            if (!((b >= 'a' && b <= 'z') ||
                  (b >= 'A' && b <= 'Z') ||
                  (b >= '0' && b <= '9'))) {
                r--;
                continue;
            }

            if (a >= 'A' && a <= 'Z') a += 32;
            if (b >= 'A' && b <= 'Z') b += 32;

            if (a != b) return false;

            l++;
            r--;
        }

        return true;
    }
}