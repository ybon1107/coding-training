import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[] basket = new int[N];
        for(int i=0; i<N; i++){
            basket[i]=i+1;
        }


        for(int i=0; i<M; i++){
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tokens.nextToken());
            int b = Integer.parseInt(tokens.nextToken());
            int aa = basket[b-1];
            int bb = basket[a-1];
            basket[a-1] = aa;
            basket[b-1] = bb;
        }
        for(int i=0; i<N; i++){
            System.out.print(basket[i] + " ");
        }
    }
}