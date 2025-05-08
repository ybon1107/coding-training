import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int c = Integer.parseInt(token.nextToken());

        int[] result = {a,b,c};

        Arrays.sort(result);

        if(result[0]+result[1] <= result[2]){
            System.out.println((result[0]+result[1])*2-1);
        } else{
            System.out.println(result[0]+result[1]+result[2]);
        }
        

    }
}