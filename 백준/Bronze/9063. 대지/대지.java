import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(token.nextToken());
            y[i] = Integer.parseInt(token.nextToken());

        }
        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println((x[n-1]-x[0])*(y[n-1]-y[0]));
    }
}