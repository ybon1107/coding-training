import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main_ch0808 {
    int[] visited;
    int[] dis = {1,-1,5};
    public int BFS(int s, int e){
        Queue<Integer> Q = new LinkedList<>();
        visited = new int[10001];

        Q.offer(s);
        visited[s] = 1;
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                for(int j=0;j<3;j++){
                    int nx = x+dis[j];
                    if(nx == e) return L+1;
                    if(visited[nx] == 0 && nx > 0 && nx < 10001){
                        visited[nx] = 1;
                        Q.offer(nx);
                    }
                }
                
            }
            L ++;
        }

        return 0;
    }
    public static void main(String[] args) throws IOException {
        Main_ch0808 T = new Main_ch0808();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
        int s = Integer.parseInt(token[0]);
        int e = Integer.parseInt(token[1]);
        System.out.println(T.BFS(s, e));
    }
}
