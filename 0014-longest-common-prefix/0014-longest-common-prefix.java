class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        String strs1 = strs[0];
        String strs2 = strs[strs.length -1];
        int index = 0;

        int minLength = Math.min(strs1.length() , strs2.length());
        while(index <minLength && strs1.charAt(index) == strs2.charAt(index)){
            index++;
        }

        return strs1.substring(0,index);

    }
}