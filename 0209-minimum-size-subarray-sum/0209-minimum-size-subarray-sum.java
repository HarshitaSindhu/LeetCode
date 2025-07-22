class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int i =0;
        int j =0;
        int answer = (int)1e9;

        while(j<n){
         sum += nums[j];

         while(sum>=target && i<=j){
            answer = Math.min(answer,j-i+1);
            sum-=nums[i];
            i++;
         }
         j++;
        }

        if(answer ==(int)1e9){
            answer = 0;
        }

    return answer;
    }
}