import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());       

        for(int i=0; i<N; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            sb.append("Case #");
            sb.append(i+1);
            sb.append(": ");
            sb.append(a+b);
            System.out.println(sb.toString());
        }
    }
}