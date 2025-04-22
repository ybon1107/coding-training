import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(token.nextToken());
        int X = Integer.parseInt(token.nextToken());

        StringTokenizer tokens = new StringTokenizer(br.readLine());
        

        for(int i=0; i< N; i++){
            int num = Integer.parseInt(tokens.nextToken());
            if(num<X){
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}