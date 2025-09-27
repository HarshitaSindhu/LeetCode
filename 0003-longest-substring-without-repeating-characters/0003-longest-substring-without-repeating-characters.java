class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character , Integer > map = new HashMap<>();
        int left = 0;
        int right = 0;
        int n = s.length();
       int maxLength = 0;
      int length = 0;


        while(right <n){
            if(map.containsKey(s.charAt(right))&& map.get(s.charAt(right))>= left){
                left = map.get(s.charAt(right))+1;
            }
             map.put(s.charAt(right) , right);
             length =  right - left+1;
              maxLength = Math.max(length , maxLength );
            right++;
        }
        return maxLength;
    }
}