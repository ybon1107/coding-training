import java.io.*;

public class Main_ch0903 {
    static int n,m;
    static int answer = Integer.MIN_VALUE;
    static int[] score, time;
    
    public void DFS(int index, int total, int use){
        if(use > m) return;
        if(index == n){
            answer = Math.max(answer,total);
        } else{
            DFS(index+1,total+score[index],use+time[index]);
            DFS(index+1,total,use);
        }
    }

    public static void main(String[] args) throws IOException{

        Main_ch0903 T = new Main_ch0903();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");

        n = Integer.parseInt(token[0]);
        m = Integer.parseInt(token[1]);
        score = new int[n];
        time = new int[n];
        for(int i=0;i<n;i++){
            String[] scores = br.readLine().split(" ");
            score[i] = Integer.parseInt(scores[0]);
            time[i] = Integer.parseInt(scores[1]);
        }

        T.DFS(0,0,0);
        System.out.print(answer);
    }
}
