import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[] cards = new int[N];

        StringTokenizer element = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cards[i] = Integer.parseInt(element.nextToken());
        }

        int max = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N;k++){
                    int sum = cards[i]+cards[j]+cards[k];
                    if(sum<=M){
                        max = Math.max(sum,max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}