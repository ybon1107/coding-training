import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] coins = {25, 10, 5, 1};
        

        for(int j=0; j<N; j++){
            StringBuilder sb = new StringBuilder();
            int total = Integer.parseInt(br.readLine());
            int[] count = {0,0,0,0};
            int result = 0;
            int i = 0;

            while(total>=0){
                result = total/coins[i];
                if(total % coins[i] == 0){
                    count[i] = result;
                    break;
                } else{
                    total -= result * coins[i];
                    count[i] = result;
                    i++;
                }
            }
            sb.append(count[0]).append(" ").append(count[1]).append(" ").append(count[2]).append(" ").append(count[3]);
            System.out.println(sb.toString());
        }

    }
}