import java.io.*;

public class Main_ch0406 {
    
    public void solution(int n, int k, int[] arr){
        int cnt = 0;
        int lt = 0;
        int answer = 0;

        for(int rt = 0; rt<n; rt++){
            if(arr[rt] == 0) cnt ++;
            
            while(cnt > k){
                if(arr[lt] == 0) { 
                    lt ++;
                    cnt --;
                } else{
                    lt ++;
                }
            }
            answer = Math.max(rt-lt+1,answer);
        }
        System.out.println(answer);
    }
    public static void main(String[] args) throws IOException{

        Main_ch0406 T = new Main_ch0406();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
        int n = Integer.parseInt(token[0]);
        int k = Integer.parseInt(token[1]);
        int[] arr = new int[n];
        String[] tokenArr = br.readLine().split(" ");
        for(int i=0; i< n; i++){
            arr[i] = Integer.parseInt(tokenArr[i]);
        }
        T.solution(n,k, arr);
        
    }
}
