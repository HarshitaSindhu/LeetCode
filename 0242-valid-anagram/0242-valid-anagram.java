import java.util.*;
class Solution {
    public static String sort(String a){
        char c[] = a.toCharArray();
           Arrays.sort(c);
           return new String(c);
    }
    public boolean isAnagram(String s, String t) {
     s= sort(s);
     t = sort(t);

      if (s.length() != t.length()) {
        return false;
      }
     if(!s.equals(t)){
        return false;
     }
     return true;
    }
}