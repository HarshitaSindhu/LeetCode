class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currentSum = 0;
        int maxSum = 0;

        for(int i= 0;i<n;i++){
            if(nums[i]==1){
                currentSum ++;
            }

            maxSum = Math.max(currentSum , maxSum);

            if(nums[i]==0){
                currentSum = 0;
            }
        }

        return maxSum;
    }
}