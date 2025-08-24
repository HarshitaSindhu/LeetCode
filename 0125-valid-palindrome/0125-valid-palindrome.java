class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Step 2: Use recursion to check
        return isPal(s, 0, s.length() - 1);
    }

    private boolean isPal(String s, int left, int right) {
        if (left >= right) return true;   // ✅ Base case
        if (s.charAt(left) != s.charAt(right)) return false; // ❌ Not palindrome
        return isPal(s, left + 1, right - 1); // \U0001f501 Move inward
    }
}
