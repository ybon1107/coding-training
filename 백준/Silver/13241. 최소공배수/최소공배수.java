import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        long a = Long.parseLong(token.nextToken());
        long b = Long.parseLong(token.nextToken());

        System.out.print(a*b/gcm(a,b));
    }

    public static long gcm(long a, long b){
        while(b != 0){
            long temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}