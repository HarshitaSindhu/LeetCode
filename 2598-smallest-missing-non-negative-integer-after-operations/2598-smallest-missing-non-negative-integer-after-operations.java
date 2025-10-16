class Solution {
    public int findSmallestInteger(int[] nums, int value) {
  
        int[] remainderCount = new int[value];
      
        for (int num : nums) {
            int remainder = ((num % value) + value) % value;
            remainderCount[remainder]++;
        }
      
        for (int i = 0; ; i++) {
  
            int requiredRemainder = i % value;
            if (remainderCount[requiredRemainder] == 0) {
                return i;
            }
          
            remainderCount[requiredRemainder]--;
        }
    }
}