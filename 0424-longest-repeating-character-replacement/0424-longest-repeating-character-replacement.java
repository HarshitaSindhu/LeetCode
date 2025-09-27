class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int freq[] = new int[26];

        int left = 0;
        int maxfre = 0;
        int maxwindow = 0;

        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'A']++;
            maxfre = Math.max(maxfre, freq[s.charAt(right) - 'A']);

            int windowlength = right - left + 1;
            if (windowlength - maxfre > k) {
                
                freq[s.charAt(left) - 'A']--; 
                left++;
            }
            windowlength = right - left + 1;
            maxwindow = Math.max(maxwindow, windowlength);
        }
        return maxwindow;
    }
}
