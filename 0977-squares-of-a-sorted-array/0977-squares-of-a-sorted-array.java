class Solution {
    public static int[] squares(int[] nums){
        
        for(int i = 0;i<nums.length;i++){
              nums[i]= nums[i]*nums[i];
         }
         return nums;
    }
    public int[] sortedSquares(int[] nums) {
        nums = squares(nums);
        Arrays.sort(nums);
        return nums;
    }
}