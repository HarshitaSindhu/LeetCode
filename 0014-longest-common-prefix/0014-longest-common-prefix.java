import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);  
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        
        int index = 0;
        int minLength = Math.min(str1.length(), str2.length());
        
        while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        
        return str1.substring(0, index);
    }
}
