import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());
        
        double[] nums = new double[N];
        double max = 0;
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(token.nextToken());
            nums[i] = x;
            max = Math.max(max,x);
        }

        double sum = 0;
        for(int i =0; i<N; i++){
            sum += (nums[i] / max) * 100;
        }

        double average = sum/N;
        System.out.println(average);

    }
}