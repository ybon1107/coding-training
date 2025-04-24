import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // greedy
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total = 0;

        while(N>=0){
            if(N%5 == 0 ){
                total += N/5;
                System.out.println(total);
                return;
            }

            N -= 3;
            total ++;
        }
        System.out.println(-1);
    }
}