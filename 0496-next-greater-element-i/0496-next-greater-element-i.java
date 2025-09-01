class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];

        for(int i = 0;i<nums1.length;i++){
            int num = nums1[i];
            int indexinNums2 = -1;

            for(int j = 0 ; j<nums2.length ; j++){
                if(num == nums2[j]){
                    indexinNums2 = j;
                    break;
                }

            }
            int nextGreater = -1;
            for(int k = indexinNums2+1 ;k < nums2.length; k++){
             if(nums2[k]>num){
                nextGreater = nums2[k];
                break;
             }
            }
            result[i] = nextGreater;
        }
        return result;
    }
}