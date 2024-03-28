import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class problem4 {
  public static void Solve(int arr[]){
    int n = arr.length;
    Map<Integer,Integer> map = new HashMap<>();
    for(int x:arr){
      map.put(x,map.getOrDefault(x,0)+1);
    }
    Stack<Integer> stack = new Stack<>();
    int answer[] = new int[n];
    for(int i=n-1;i>=0;i--){
      while(!stack.isEmpty() && map.get(stack.peek()) <= map.get(arr[i])){
          stack.pop();
      }
      if(stack.isEmpty())
        answer[i] = -1;
      else 
        answer[i] = stack.peek();
      stack.push(arr[i]);
    }
    System.out.println(Arrays.toString(answer));
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    Solve(arr);
    in.close();
  }
}
