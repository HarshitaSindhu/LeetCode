class Solution {
    public static String sort(String c){
        char ch[] = c.toCharArray();
        Arrays.sort(ch);
        return new String(ch);

    }
    public boolean isAnagram(String s, String t) {
     s = sort(s);
     t = sort(t);


     if(s.length() != t.length() ){
        return false;
     }    
     
        for(int i = 0;i<s.length();i++){
        if(s.charAt(i) != t.charAt(i)){
            return false;
        }
        }
     
    
     return true;
    }
}