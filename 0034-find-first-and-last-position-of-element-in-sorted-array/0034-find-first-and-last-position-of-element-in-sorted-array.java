class Solution {

    public int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int answer = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (start > end) {
                break;
                } 
        }
        return answer;
    }

    public int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int answer = arr.length;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerBound(nums, target);

        if (lb == n || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, upperBound(nums, target) - 1};
    }
}
