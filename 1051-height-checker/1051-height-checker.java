class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;

        // Step 1: Create sorted version
        int[] expected = heights.clone();
        Arrays.sort(expected);

        // Step 2: Compare from left to right
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
