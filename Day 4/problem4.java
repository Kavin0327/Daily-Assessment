import java.util.*;
public class problem4 {
  public static int Solve(String input){
    int n = input.length();
    int freq[] = new int[26];
    for(char ch:input.toCharArray()){
        freq[ch-'a']++;
    }
    for(int i=0;i<n;i++){
      if(freq[input.charAt(i)-'a'] == 1)
        return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    int index = Solve(input);
    System.out.println("Index : "+index);
    in.close();
  }
}
