class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
       
        for(int k = 0;k<n;k++){
            if(nums[k]!=nums[i]){
                i++;
                nums[i]= nums[k];
            }
        }
        return i+1;
    }
}