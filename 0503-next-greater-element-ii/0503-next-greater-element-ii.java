class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[] = new int[nums.length];
        for(int i =0;i<n;i++){
            result[i] = -1;
         }
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<2*n;i++){
            int currentIndex = i%n;
            int currentElement = nums[currentIndex];
            while(!st.isEmpty()&& nums[st.peek()]<currentElement){
                int temp = st.pop();
                result[temp] = currentElement;
            }
            if(i<n){
                st.push(currentIndex);
            }
        }
        return result;
    }
}