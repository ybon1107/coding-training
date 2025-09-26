import java.io.*;
import java.util.Stack;

public class Main_ch0603 {
    public void solution(int n, int move, int[][] board, int[] moves){
        Stack<Integer> stack = new Stack<>();
        
        int last = 0, cnt =0;
        for(int m: moves){
            int p = 0;
             while(p < n && board[p][m-1] == 0){
                p++;
            }
            if(p == n) continue;
            if(!stack.isEmpty()) {
                last = stack.peek();
            }
            if(last == board[p][m-1]){
                stack.pop();
                cnt += 2;
            } else{
                stack.push(board[p][m-1]);
            }
            board[p][m-1] = 0;
        }
        System.out.println(cnt);
        
    }
    public static void main(String[] args) throws IOException {
        Main_ch0603 T = new Main_ch0603();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            String[] token = br.readLine().split(" ");
            for(int j=0;j<n;j++){
                board[i][j] = Integer.parseInt(token[j]);
            }
        }

        int move = Integer.parseInt(br.readLine());
        int[] moves = new int[move];
        String[] tokenM = br.readLine().split(" ");
        for(int i=0;i<move;i++){
            moves[i] = Integer.parseInt(tokenM[i]);
        }
        
        T.solution(n,move,board,moves);

    }
}
