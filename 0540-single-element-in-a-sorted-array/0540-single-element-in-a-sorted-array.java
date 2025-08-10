class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Ensure mid is even (pair starts at even index)
            if (mid % 2 == 1) {
                mid--;
            }

            // If pair is proper, move to right half
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } 
            // Otherwise, the single element is on the left
            else {
                high = mid;
            }
        }

        return nums[low];
    }
}
