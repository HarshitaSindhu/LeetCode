class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character , Integer> map = new HashMap<>();

        int maxLen = 0;;
        int left = 0;

        for(int right = 0; right<s.length();right++){
            char currentChar = s.charAt(right);
            if(map.contains(currentChar) && map.get(currentChar) >= left){
                left = map.get(currentChar)+1;
            }
            map.put(currentChar , right);
            maxLen  = Math.max(maxLen , right-left +1);

        }
        return maxLen;
    }
}