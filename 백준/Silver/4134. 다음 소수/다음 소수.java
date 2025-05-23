import java.io.*;

class Main {
    public static int gcd(int a, int b){
        while(b !=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            long n = Long.parseLong(br.readLine());
            while(true){
                if(n <= 1) {
                    n++;
                    continue;
                }

                boolean isPrime = true;
                for(long j = 2; j*j <= n; j++ ){
                    if(n%j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(n);
                    break;
                } else {
                    n++;
                }
            }
        }
    }
}