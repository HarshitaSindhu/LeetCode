class Solution {
    public int m = (int)Math.pow(10 , 9) + 7;

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        int smaller_right[] = new int[n];
        for(int i = 0; i < n; i++) {
            while(!st.empty() && arr[i] <= arr[st.peek()]) {
                smaller_right[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()) {
            smaller_right[st.pop()] = n;
        }

        int smaller_left[] = new int[n];
        st.clear();
        for(int i = n - 1; i >= 0; i--) { 
            while(!st.empty() && arr[i] < arr[st.peek()]) {
                smaller_left[st.peek()] = i; 
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()) {
            smaller_left[st.pop()] = -1; 
        }

        long totalSum = 0;
        for(int i = 0; i < n; i++) {
            long endingLength = (smaller_right[i] - i + m) % m; 
            long startingLength = (i - smaller_left[i] + m) % m; 
            long numberofSubarray = (endingLength * startingLength) % m;
            totalSum = (totalSum + numberofSubarray * arr[i] % m) % m;
        }
        return (int)(totalSum);
    }
}