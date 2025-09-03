class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] lastSeen = new int[3];
        
        for (int i = 0; i < 3; i++) {
            lastSeen[i] = -1;
        }
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            lastSeen[s.charAt(i) - 'a'] = i;
            int minIndex = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            if (minIndex != -1) {
                count += (minIndex + 1);
            }
        }
        
        return count;
    }
}
