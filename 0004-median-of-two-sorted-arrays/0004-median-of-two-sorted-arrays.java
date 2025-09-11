class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[nums1.length + nums2.length];
        
        // Merge the two arrays
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
            } else {  // This was wrong in your code (used if instead of else)
                result[k] = nums2[j];
                j++;
                k++;
            }
        }

        // Copy remaining elements from nums1
        while(i < nums1.length) {
            result[k] = nums1[i];  // Fixed: was 'nums[i]' in your code
            i++;
            k++;
        }

        // Copy remaining elements from nums2
        while(j < nums2.length) {
            result[k] = nums2[j];  // Fixed: was 'nums[j]' in your code
            j++;
            k++;
        }
        
        // Find and return the median
        int n = result.length;
        if(n % 2 == 1) {
            return result[n / 2]; // Odd case
        } else {
            // Even case → average of two middle numbers
            return (result[n / 2 - 1] + result[n / 2]) / 2.0;
        }
    }
}
