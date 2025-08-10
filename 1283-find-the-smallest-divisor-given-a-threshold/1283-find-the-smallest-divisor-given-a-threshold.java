class Solution {

    public static boolean isPossible(int nums[], int divisor, int threshold) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i] / divisor;
            if (nums[i] % divisor != 0) {
                value = value + 1;
            }
            totalSum = totalSum + value;
        }
        if (totalSum <= threshold) {
            return true;
        } else {
            return false;
        }
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int start = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int end = max;
        int answer = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (isPossible(nums, mid, threshold)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }
}
