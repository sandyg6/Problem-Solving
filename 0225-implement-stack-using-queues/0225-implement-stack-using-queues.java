class MyStack {

    public Queue<Integer> q1;
    public Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size() > 1){
            q2.add(q1.poll());
        }

        int rem_element = q1.poll();
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;

        return rem_element;
    }

    public int top() {
        while(q1.size() > 1){
            q2.add(q1.poll());
        }
        int topElement = q1.poll();
        q2.add(topElement);
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;

        return topElement;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */