import java.io.*;
  
public class Main {

  public String solution(int n, String s){
        
        s = s.replace('#','1');
        s = s.replace('*','0');

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i=i+7){
            int a = Integer.parseInt(s.substring(i,i+7),2);
            char c = (char) a;
            sb.append(c);
        }

        return String.valueOf(sb);
    }

  public static void main(String[] args) throws IOException {
    Main T = new Main();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String a = br.readLine();
    String result = T.solution(n,a);
    System.out.println(result);
  }
}