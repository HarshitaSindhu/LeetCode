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
            sum += (nums[r] % 2);
            while (sum > goal) {
                sum -= (nums[l] % 2);
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}
