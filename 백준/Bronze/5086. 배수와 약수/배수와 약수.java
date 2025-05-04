import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            StringBuilder sb = new StringBuilder();

            if(a == 0|| b == 0){
                break;
            }
            
            if(a>b){
                if(a%b == 0){
                    sb.append("multiple");
                } else{
                    sb.append("neither");
                }
            } else{
                if(b%a == 0){
                    sb.append("factor");
                } else{
                    sb.append("neither");
                }
            }
            System.out.println(sb.toString());
        }
        
    }
}