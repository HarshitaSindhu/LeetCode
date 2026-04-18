class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();

        int n = pushed.length;
        int i = 0, j = 0;

        while (i < n) {
            st.push(pushed[i]);

            while (!st.isEmpty() && j < n && st.peek() == popped[j]) {
                st.pop();
                j++;
            }

            i++;
        }

        return j == n;
    }
}