class Solution {
    public void sortColors(int[] nums) 
    {
      int countZero = 0;
      int countOne = 0;
      int countTwo = 0;
      int n = nums.length;

      for(int i = 0;i<n;i++){
        if(nums[i]==0){
            countZero++;
        }
        if(nums[i]==1){
            countOne++;
        }
        if(nums[i]==2){
            countTwo++;
        }
      }

      int j = 0;
      for(int i = 0;i<countZero;i++){
        nums[j]=0;
        j++;
      }
      for(int i = 0;i<countOne;i++){
        nums[j]=1;
        j++;
      }for(int i = 0;i<countTwo;i++){
        nums[j]=2;
        j++;
      }
     
     }
}