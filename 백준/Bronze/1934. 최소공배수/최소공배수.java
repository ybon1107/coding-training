import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            System.out.println(lcm(A,B));
        }
    }
    
    public static int lcm(int A, int B){

        return A*B/gcd(A,B);

    }

    public static int gcd(int A, int B){
        while(B !=0){
            int temp = A%B;
            A=B;
            B = temp;
        }
        return A;
    }
}