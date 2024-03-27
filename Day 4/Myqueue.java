import java.util.Stack;
public class Myqueue {
    Stack<Integer> stack ;
    Stack<Integer> queue ;
public Myqueue() {
    stack = new Stack<>();
    queue = new Stack<>();
}

public void push(int x) {
    while(!queue.isEmpty()){
        stack.push(queue.peek());
        queue.pop();
    }
    stack.push(x); 
    while(!stack.isEmpty()){
        queue.push(stack.pop());
    }
}

public int pop() {
    return queue.pop();
}

public int peek() {
    return queue.peek();
}

public boolean empty() {
    return queue.isEmpty();
}
}
