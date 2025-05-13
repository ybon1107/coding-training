import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr,(a,b) ->{
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}