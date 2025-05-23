import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                break;
            }

            int count = 0;

            for(int i=n+1; i<=2*n; i++){
                boolean isPrime = true;
                if(i == 1){
                    System.out.println(1);
                    break;
                }
                for(int j=2;j*j<=i;j++){
                    if(i%j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    count ++;
                }
            }
            System.out.println(count);

        }
    }
}