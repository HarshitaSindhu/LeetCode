class Solution {
    private int atMost(int[] nums, int goal) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        int l = 0, r = 0;

        if (goal < 0) {
            return 0;
        }

        while (r < n) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}