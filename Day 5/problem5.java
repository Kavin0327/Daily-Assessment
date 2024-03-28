import java.util.Scanner;
import java.util.Stack;

public class problem5 {
  public static void Solve(int n){
    Stack<Integer> stack = new Stack<>();
    String num = n+"";
    for(int i=0;i<num.length();i++){
      int digit = num.charAt(i)-'0';
      stack.push(digit);
    }
    while(!stack.isEmpty()){
      System.out.print(stack.pop());
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); 
    Solve(n);
    in.close();
  }
}
