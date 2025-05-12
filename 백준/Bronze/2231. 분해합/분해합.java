import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Nstring = br.readLine();
        long N = Long.parseLong(Nstring);
        long start = Math.max(0,N - (9*Nstring.length()));
        for(long i=start; i<N; i++){
            long sum = i;
            String element = String.valueOf(i);
            for(int j=0;j<element.length();j++){
                sum += Long.parseLong(String.valueOf(element.charAt(j)));
            }

            if(sum == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
        
    }
}