class Solution {
    public String countAndSay(int n) {
        // base case
        if (n == 1) return "1";
        
        // get the (n-1)th string recursively
        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        
        int count = 1;
        char prevChar = prev.charAt(0);
        
        for (int i = 1; i < prev.length(); i++) {
            char c = prev.charAt(i);
            if (c == prevChar) {
                count++;
            } else {
                sb.append(count).append(prevChar);
                count = 1;
                prevChar = c;
            }
        }
        
        // append the last group
        sb.append(count).append(prevChar);
        
        return sb.toString();
    }
}
