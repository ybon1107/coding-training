import java.io.*;

public class Main_ch0902 {
    static int N, c;
    static int[] arr;
    static int answer=Integer.MIN_VALUE;
    
    public void DFS(int index, int sum){
        if(sum>c) return;
        if(index == N){
            answer = Math.max(answer,sum);
            return;
        } else{
            DFS(index+1,sum+arr[index]);

            DFS(index+1,sum);

        }

    }
    
    public static void main(String[] args) throws IOException{
        Main_ch0902 T = new Main_ch0902();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
        c = Integer.parseInt(token[0]);
        N = Integer.parseInt(token[1]);
        arr = new int[N];
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        T.DFS(0,0);
        System.out.println(answer);
    }
}
