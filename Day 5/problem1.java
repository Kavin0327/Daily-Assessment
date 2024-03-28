import java.util.Scanner;

public class problem1 {
  public static int Solve(int tickets[],int k){
    int timeTaken = 0;
        int n = tickets.length; 
        while(tickets[k] > 0){
            for(int i=0;i<n;i++){
                if(tickets[i] > 0){
                    tickets[i]--;
                    timeTaken++;   
                }
                if(i == k && tickets[k] == 0)
                    return timeTaken;
            }
        }
        return timeTaken;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int tickets[] = new int[n];
    for(int i=0;i<n;i++){
      tickets[i] = in.nextInt();
    }
    int pos = in.nextInt();
    int timeTaken = Solve(tickets,pos);
    System.out.println("Time Taken : "+timeTaken);
    in.close();
  }
}
