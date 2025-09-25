import java.io.*;
// 1 2 1 3 1 1 1 2
public class Main {

    public void solution(int n, int m, int[] arr){
        int lt = 0;
        int sum = 0;
        int cnt = 0;
        for(int rt=0; rt<n; rt++){
            sum += arr[rt];
            if(sum == m) cnt ++;
            while(sum >= m ){
                sum -= arr[lt++];
                if(sum == m) cnt ++;
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
