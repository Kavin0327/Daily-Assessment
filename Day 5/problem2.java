import java.util.Scanner;
import java.util.Stack;

public class problem2 {
  public static void Solve(String arr[]){
    int n = arr.length;
    Stack<Integer> stack = new Stack<>();
    for(String op:arr){
      if(op.equals("C")){
        stack.pop();
      }
      else if(op.equals("D")){ 
        int last = stack.peek();
        stack.push(2*last);
      }
      else if(op.equals("+")){
        int y = stack.pop();
        int x = stack.pop();
        stack.push(x);
        stack.push(y);
        stack.push(x+y);
      }
      else{
        stack.push(Integer.parseInt(op));
      }
    }
    int answerSum = 0;
    while(!stack.isEmpty()){
      answerSum += stack.pop();
    }
    System.out.println("Total Sum : "+answerSum);
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); 
    String ops[] = new String[n];
    for(int i=0;i<n;i++)
      ops[i] = in.next();
    Solve(ops);
    in.close();
  }
}
