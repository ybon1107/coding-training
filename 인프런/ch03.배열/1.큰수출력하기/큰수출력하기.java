import java.io.*;
  
public class Main {

  public void solution(int n, String[] token){
    StringBuilder sb = new StringBuilder();
    sb.append(token[0]);
    for(int i=1; i<n;i++){
        int f = Integer.parseInt(token[i-1]);
        int b = Integer.parseInt(token[i]);

        if(f<b){
            sb.append(" "+ b);
        }
    }
    System.out.println(String.valueOf(sb));
  }

  public static void main(String[] args) throws IOException {
    Main T = new Main();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    String[] token = br.readLine().split(" ");
    
    T.solution(n,token);
  }
}