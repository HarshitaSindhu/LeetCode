
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
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
        
        sb.append(count).append(prevChar);
        
        return sb.toString();
    }
}