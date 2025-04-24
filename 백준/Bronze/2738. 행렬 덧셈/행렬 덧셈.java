import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[][] arrayA = new int[N][M];

        

        for(int i=0; i<N; i++){
            StringTokenizer tokenA = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                arrayA[i][j] = Integer.parseInt(tokenA.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            StringTokenizer tokenB = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<M; j++){
                int result = arrayA[i][j] + Integer.parseInt(tokenB.nextToken());
                sb.append(result).append(" ");
            }
            System.out.println(sb.toString());
        }


    }
}