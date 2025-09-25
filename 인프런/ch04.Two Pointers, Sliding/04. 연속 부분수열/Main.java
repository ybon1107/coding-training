import java.io.*;

public class Main {

    public void solution(int n, int m, int[] arr){
        int cnt = 0;
        int s_indx = 0;
        int indx =0;
        int sum = 0;
        while(s_indx < n){
            sum += arr[indx];
            if(sum == m){
                cnt ++;
                s_indx ++;
                indx = s_indx;
                sum = 0;
                continue;
            } else if(sum > m){
                sum = 0;
                s_indx ++;
                indx = s_indx;
            } else{
                if(indx == n-1){
                    indx = s_indx;
                    s_indx ++;
                    sum = 0;
                } else{
                    indx ++;
                }
                
            }
        }
        
        System.out.println(cnt);
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
        int n = Integer.parseInt(token[0]);
        int m = Integer.parseInt(token[1]);
        int[] arr = new int[n];
        String[] arrToken = br.readLine().split(" ");
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(arrToken[i]);
        }

        T.solution(n,m,arr);
    }
}
