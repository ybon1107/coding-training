import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());
        int[] coins = new int[N];
        for(int i=0; i<N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        int total = 0;
        for(int j=N-1; j>=0; j--){
            if(coins[j]<= K){
                total += K/coins[j];
                K = K%coins[j];
            }
            if(K == 0){
                break;
            }
        }
        System.out.println(total);
    }
}