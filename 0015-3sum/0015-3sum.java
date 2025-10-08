import java.util.*;

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    private void twoSum(int[] nums, int target, int left, int right) {
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
               
                int first = -target;
                int second = nums[left];
                int third = nums[right];

                List<Integer> triplet = new ArrayList<>();
                triplet.add(first);
                triplet.add(second);
                triplet.add(third);

                result.add(triplet);

                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            twoSum(nums, target, i + 1, n - 1);
        }

        return result;
    }
}
