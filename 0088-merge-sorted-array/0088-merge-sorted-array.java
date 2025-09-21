import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums2 ke saare elements nums1 ke last me daal do
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // ab nums1 ko sort kar do
        Arrays.sort(nums1);
    }
}
