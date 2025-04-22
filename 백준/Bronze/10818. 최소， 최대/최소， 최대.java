import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());

        int min = 1000000;
        int max = -1000000;

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(token.nextToken());
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }
        System.out.println(min + " " + max);
    }
}