import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenA = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(tokenA.nextToken());
        int b = Integer.parseInt(tokenA.nextToken());

        StringTokenizer tokenB = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(tokenB.nextToken());
        int d = Integer.parseInt(tokenB.nextToken());

        int gcm = gcm(b,d); 
        int lcm = b*d/gcm;

        int resultA = a*(lcm/b) + c*(lcm/d);
        int resultB = lcm;

        int resultGcm = gcm(resultA, resultB);
        System.out.println(resultA/resultGcm + " " + resultB/resultGcm);
    }

    public static int gcm(int a, int b){
        while( b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}