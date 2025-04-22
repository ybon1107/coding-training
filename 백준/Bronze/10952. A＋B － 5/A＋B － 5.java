import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            
            if(a == 0 && b == 0){
                break;
            }
            
            int result = a+b;
            sb.append(result + "\n");

        }
        System.out.println(sb.toString());
    }
}