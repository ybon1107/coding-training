import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int result = 0;
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(token.nextToken());
            if (n < 2) continue;
            boolean isTrue = true;

            for(int j=2; j*j <= n; j++){
                if(n%j ==0){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) result ++;
            
        }
        System.out.println(result);
    }
}