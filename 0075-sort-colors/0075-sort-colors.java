class Solution {
    public void sortColors(int[] nums) {
     int n = nums.length;
     int countZero = 0;
     int countOne = 0;
     int countTwo = 0;

     for(int i= 0;i<n ;i++){
        if(nums[i]== 0){
            countZero++;
        }
        else if(nums[i]==1){
            countOne++;
        }
        else if (nums[i] == 2){
            countTwo++;
        }
     }
        int j = 0;

        for(int k = 0;k<countZero;k++){
            nums[j] = 0;
            j++;
        }

        
        for(int k =0;k<countOne;k++){
            nums[j] = 1;
            j++;
        }
        for(int k =0;k<countTwo;k++){
            nums[j] = 2;
            j++;
        }
     
    }
}