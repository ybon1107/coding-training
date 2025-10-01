import java.io.*;
import java.util.*;

public class Main_ch0905 {
    static int answer = Integer.MAX_VALUE;
    static int n,m;
    public void DFS(int cnt, int sum, Integer[] coins){
        if(sum > m) return;
        if (cnt >= answer) return;
        if(sum == m){
            answer = Math.min(answer,cnt);
        } else{
            for(int i=0;i<n;i++){
                DFS(cnt + 1, sum + coins[i],coins);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        Main_ch0905 T = new Main_ch0905();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] token = br.readLine().split(" ");
        Integer[] coins = new Integer[n];
        for(int i =0; i<n;i++){
            coins[i] = Integer.parseInt(token[i]);
        }
        Arrays.sort(coins, Collections.reverseOrder());
        m = Integer.parseInt(br.readLine());
        T.DFS(0,0, coins);
        System.out.print(answer);
    }
}
