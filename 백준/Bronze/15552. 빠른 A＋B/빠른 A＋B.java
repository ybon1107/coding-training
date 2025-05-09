import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
             StringTokenizer token = new StringTokenizer(br.readLine());
             int a = Integer.parseInt(token.nextToken());
             int b = Integer.parseInt(token.nextToken());
             bw.write((a+b)+ "\n");
        }
        bw.flush();
        bw.close();
    }
}