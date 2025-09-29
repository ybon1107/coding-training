import java.io.*;

public class Main_ch0901 {
    static String answer = "NO";
    static int n, total=0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr){
        if(flag) return;
        if(sum >(total/2)) return;
        if(L==n){
            if((total-sum) == sum){
                answer = "YES";
                flag = true;
            }
        } else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }
    }

    public static void main(String[] args) throws IOException {
        Main_ch0901 T = new Main_ch0901();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        String[] token = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(token[i]);
            total += arr[i];
        }

        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
