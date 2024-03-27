import java.util.Scanner;
import java.util.Stack;

class problem1{
  public static void Solve(String words[]) {
    Stack<String> stack = new Stack<>();
    for(String word:words){
      if(stack.isEmpty()){
          stack.push(word);
      }
      else{
          if(word.equals(stack.peek()))
            stack.pop();
          else
            stack.push(word);
      }
    }
    System.out.println(stack.size());
    stack.clear();
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); 
    String arr[] = new String[n];
    for(int i=0;i<n;i++){
      arr[i] = in.next();
    }
    Solve(arr);
    in.close();
   }
}