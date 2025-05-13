import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            arr[i][0] = token.nextToken();
            arr[i][1] = token.nextToken();
        }
        Arrays.sort(arr, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}