class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<num.length() ;i++){
            char digit = num.charAt(i);
            while(!st.isEmpty()&& k>0&& st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(k>0 &&!st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }

        result.reverse();

         String res = result.toString();
        
        int i = 0;
        while (i < res.length() && res.charAt(i) == '0') {
            i++;
        }
        res = res.substring(i);
        
        if (res.length() == 0) {
            res = "0";
        }
        
        return res;


    }
}