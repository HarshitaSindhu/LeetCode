class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int j =0;
        for(int i =0;i<n;i++){
            if(nums[i]%2==0){
               int temp = nums[j];
               nums[j]=nums[i];
               nums[i]=temp;
                j++;
            }
        }
        return nums;
        
    }
}
