class Solution {
    public long subArrayRanges(int[] nums) {
        return subArrayMax(nums) - subArrayMin(nums);
    }

    private long subArrayMax(int[] nums) {
        int n = nums.length;
        long res = 0;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        // Previous Greater or Equal
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Greater
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            res += (long)nums[i] * left[i] * right[i];
        }

        return res;
    }

    private long subArrayMin(int[] nums) {
        int n = nums.length;
        long res = 0;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        // Previous Smaller or Equal
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            res += (long)nums[i] * left[i] * right[i];
        }

        return res;
    }
}
