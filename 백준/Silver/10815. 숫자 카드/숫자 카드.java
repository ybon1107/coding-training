import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer TokenN = new StringTokenizer(br.readLine());
        int[] listN = new int[N];

        for(int i=0; i<N; i++){
            listN[i] = Integer.parseInt(TokenN.nextToken());
        }

        Arrays.sort(listN);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer TokenM = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            int num = Integer.parseInt(TokenM.nextToken());
            sb.append(Arrays.binarySearch(listN, num) >= 0 ? "1": "0").append(" ");
        }
        System.out.println(sb);
    }
}