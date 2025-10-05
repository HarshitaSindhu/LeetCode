class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n =nums1.length;
        int m = nums2.length;
        int i =0;
        int j =0;
        int k =0;
        int result[]=new int[n+m];
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                result[k]= nums1[i];

                i++;
                k++;

            }
            else {
                result[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            result[k]=nums1[i];
            i++;
            k++;
        }
          while(j<nums2.length){
            result[k]=nums2[j];
            j++;
            k++;
        }
        
        int x = result.length;
        if(x%2==1){
            return result[x/2];

        }
        else {
            // Even case → average of two middle numbers
            return (result[x / 2 - 1] + result[x / 2]) / 2.0;
        }
    }
}