import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[] nums = new int[N];

        for(int a=0; a<M; a++){
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(tokens.nextToken());
            int j = Integer.parseInt(tokens.nextToken());
            int k = Integer.parseInt(tokens.nextToken());
            for(int l=i-1; l<=j-1; l++){
                nums[l] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}