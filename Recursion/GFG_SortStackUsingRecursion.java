class GFG_SortStackUsingRecursion {
    void insert(Stack<Integer> s, int temp){
        if(s.size()==0 || s.peek()<=temp){
            s.push(temp);
            return;
        }
        int val = s.peek();
        s.pop();
        insert(s,temp);
        s.push(val);
        return;
    }
    
    void sortStack(Stack<Integer> s){
        if(s.size()==1) return;
        int temp = s.peek();
        s.pop();
        sort(s);
        insert(s,temp);
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        sortStack(s);
        return s;
    }
}