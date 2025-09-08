class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<ArrayList<Integer>> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty()) {
                if (st.peek().get(0) == (int) (s.charAt(i))) {
                    ArrayList<Integer> topElement = st.pop();
                    int fre = topElement.get(1);
                    topElement.set(1, fre + 1);
                    st.push(new ArrayList<>(topElement));
                } else {
                    ArrayList<Integer> curElement = new ArrayList<>();
                    curElement.add((int) (s.charAt(i)));
                    curElement.add(1);
                    st.push(new ArrayList<>(curElement));
                }
            } else {
                ArrayList<Integer> curElement = new ArrayList<>();
                curElement.add((int) (s.charAt(i)));
                curElement.add(1);
                st.push(new ArrayList<>(curElement));
            }
            
            if (st.peek().get(1) == k) {
                st.pop();
            }
        }
        
      
        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            ArrayList<Integer> topElement = st.pop();
            int ascii_value = topElement.get(0);
            int fre = topElement.get(1);
            while (fre > 0) {
                str.append((char) (ascii_value));
                fre--;
            }
        }
        
        str.reverse();
        return str.toString();
    }
}

