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
            basket[i]= i+1;
        }

        for(int i=0; i<M; i++){
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tokens.nextToken())-1;
            int b = Integer.parseInt(tokens.nextToken())-1;
            
            while(a<b){
                int temp = basket[a];
                basket[a] = basket[b];
                basket[b] = temp;
                a++;
                b--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num: basket){
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString());
    }
}