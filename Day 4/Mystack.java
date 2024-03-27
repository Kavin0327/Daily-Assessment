import java.util.LinkedList;
import java.util.Queue;

class Mystack { // class name problem2 instead of Mystack 
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> dummy = new LinkedList<>();    
    Mystack(){
        
    }
    public void push(int x) {
        while( queue.size() > 0)
            dummy.add(queue.poll());
        
        queue.add(x);
        while( dummy.size() > 0 )
            queue.add(dummy.poll());
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
