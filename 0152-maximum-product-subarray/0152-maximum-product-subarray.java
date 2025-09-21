class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int currMax = nums[0], currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            
            if (x < 0) { // negative aaya toh swap kar do
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(x, currMax * x);
            currMin = Math.min(x, currMin * x);

            ans = Math.max(ans, currMax);
        }
        return ans;
    }
}
