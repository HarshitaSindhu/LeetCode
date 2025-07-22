import java.util.Stack;

class Solution {

    int calculate(String op, int a, int b) {
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("*") || token.equals("-") || token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(calculate(token, a, b));
            } else {
                int value = Integer.parseInt(token);
                st.push(value);
            }
        }

        return st.peek();
    }
}
