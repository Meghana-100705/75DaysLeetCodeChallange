class MinStack {

Stack<Integer> stk=new Stack<>();
Stack<Integer> stk1=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stk.push(val);
        if(stk1.isEmpty() || val<=stk1.peek()){
            stk1.push(val);
        }
    }
    
    public void pop() {
        int poped=stk.pop();
        if(poped==stk1.peek()){
            stk1.pop();
        }
    }
    
    public int top() {
            return stk.peek();
    }
    
    public int getMin() {
        return stk1.peek();
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