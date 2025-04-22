import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer token = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(token.nextToken());
            if(a == target){
                total++;
            }
        }
        System.out.println(total);

    }
}