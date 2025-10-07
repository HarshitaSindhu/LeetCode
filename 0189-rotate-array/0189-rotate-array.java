class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int newArray[] = new int[n];
        for(int i = 0;i<n;i++){
            int newIndex = (i+k)%n;
            newArray[newIndex] = nums[i];
        } 

        for(int i =0;i<n;i++){
            nums[i] = newArray[i];
        }
    }
}