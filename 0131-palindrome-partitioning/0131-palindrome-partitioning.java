class Solution {
    // Function to check if a string is palindrome
    private boolean isPalin(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    private void getAllParts(String s, int start, List<String> partitions, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(partitions));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalin(s, start, i)) {
                partitions.add(s.substring(start, i + 1));
                getAllParts(s, i + 1, partitions, ans);
                partitions.remove(partitions.size() - 1); // backtrack
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        getAllParts(s, 0, new ArrayList<>(), ans);
        return ans;
    }
}