import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());
        
        int[] nums = new int[N];
        double total = 0;
        double max = 0;
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(token.nextToken());
            nums[i] = x;
            total += x;
            max = Math.max(max,x);
        }

        double average = ((total/max)*100)/N;
        System.out.println(average);

    }
}