class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0|| strs == null ){
            return "";
        }
        int n = strs.length;
        Arrays.sort(strs);
        String strs1 = strs[0];
        String strs2 = strs[n-1];
        int minL = Math.min(strs1.length() , strs2.length());
        int index = 0;

        while( index< minL && strs1.charAt(index)== strs2.charAt(index)){
            index++;
        } 
        return  strs1.substring(0 , index);
    }
}