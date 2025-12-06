class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int answer[] = new int[n];
        k=k%n;
        for(int i =0;i<n;i++){
          int newIndex= (k+i)%n;
          answer[newIndex] = nums[i];
          newIndex++;
        }

        for(int i = 0;i<n;i++){
            nums[i]= answer[i];
        }
    }
}