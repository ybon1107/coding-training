import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());

        StringTokenizer scores = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(scores.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[N-k]);
    }
}