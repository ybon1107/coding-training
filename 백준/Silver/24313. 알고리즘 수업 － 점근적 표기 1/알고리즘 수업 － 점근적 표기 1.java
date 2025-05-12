import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer token = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(token.nextToken());
        int a0 = Integer.parseInt(token.nextToken());
        
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if(a1 <= c && (a1-c) * n0 + a0 <=0){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}