class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int result[] = new int[nums1.length];

       for(int i = 0;i<nums1.length;i++){
        int num = nums1[i];
        int indexInnums2 = -1;

        for(int j = 0;j<nums2.length;j++){
            if(nums2[j]==num){
                indexInnums2 =j;
                break;
            }
        }
        int nextGreater =-1;
        for(int k = indexInnums2+1;k<nums2.length;k++){
            if(nums2[k]>num){
               nextGreater = nums2[k];
               break;
            }
        }
        
          result[i]= nextGreater;

       }
        return result;
    }
}
