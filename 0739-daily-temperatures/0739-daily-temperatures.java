class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]< temperatures[i]){
             
             answer[st.peek()] = i-st.peek();
             st.pop();
            }

            st.push(i);
        }
        return answer;
    }
}