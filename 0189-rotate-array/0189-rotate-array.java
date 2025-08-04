class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int reversed[] = new int[n];
        k = k % n;  // handle cases where k > n
        
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            reversed[newIndex] = nums[i];
        }

        // Copy back to original array (required for "in-place" effect)
        for (int i = 0; i < n; i++) {
            nums[i] = reversed[i];
        }
    }
}


     