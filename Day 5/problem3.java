package Output;

import java.util.Scanner;


public class problem3 {
  public static String Solve(String s){
    StringBuilder answer = new StringBuilder();
    int openCount = 0;
    int closeCount = 0;
    int left = 0;
    int n = s.length();
    for(int i=0;i<n;i++){
        if(s.charAt(i) == '(')
            openCount++;
        else
            closeCount++;
        if(openCount == closeCount){
            for(int j=left+1;j<i;j++)
                answer.append(s.charAt(j));
            openCount = 0;
            closeCount = 0;
            left = i+1;
        }
    }
    return answer.toString();
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   String parenthesis = in.nextLine();
   String answer = Solve(parenthesis);
   System.out.println(answer);
   in.close();
  }
}
