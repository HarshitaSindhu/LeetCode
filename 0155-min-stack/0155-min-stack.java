class MinStack {
    Stack<Integer> st;
    Stack<Integer> miStack;
    int minimumValue;

    public MinStack() {
     st = new Stack<>();
     miStack= new Stack<>();   
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            minimumValue = val;
        }
        else{
            minimumValue = Math.min(miStack.peek() , val);
        }
        st.push(val);
        miStack.push(minimumValue);
    }
    
    public void pop() {
        if(st.isEmpty()){
            return ;
        }
        else{
            st.pop();
            miStack.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return miStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */