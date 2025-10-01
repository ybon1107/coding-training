import java.io.*;
import java.util.Arrays;

public class Main_ch0905_DP {
    
    public void DP(int[] coins, int m){
        int[] dp = new int[m + 1];
        Arrays.fill(dp,10001);
        dp[0] = 0;
        for(int coin : coins){
            for(int i = coin; i<=m; i++){
                dp[i] = Math.min(dp[i],dp[i-coin]+1);
            }
        }
        System.out.print(dp[m]);
    }
    
    public static void main(String[] args) throws IOException{
        Main_ch0905_DP T = new Main_ch0905_DP();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] token = br.readLine().split(" ");
        int[] coins = new int[n];
        for(int i =0; i<n;i++){
            coins[i] = Integer.parseInt(token[i]);
        }
        int m = Integer.parseInt(br.readLine());
        T.DP(coins,m);
    }
}
