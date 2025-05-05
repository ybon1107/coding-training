import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = N;
        for(int i = 2; i <= max; i++){
            while(N % i == 0) {
                System.out.println(i);
                N = N/i;
            }
        }
    }
}