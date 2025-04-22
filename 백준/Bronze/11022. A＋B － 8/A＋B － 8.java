import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<N+1; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int result = a+b;
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + result + "\n");
        }
        bw.flush();
        bw.close();
    }
}