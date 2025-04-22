import java.io.*;

public class Main {
    
    static int N;
    static char[][] board;
    static int maxCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];

        for(int i = 0 ; i < N ; i ++){
            board[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            checkLine(i);
            checkColumn(i);
        }

        for (int i = 0; i < N; i++) {
    for (int j = 0; j < N; j++) {

        // 오른쪽 스왑
        if (j + 1 < N && board[i][j] != board[i][j + 1]) {
            swap(i, j, i, j + 1);
            checkLine(i);
            checkColumn(j);
            checkColumn(j + 1);
            swap(i, j, i, j + 1);
        }

        // 아래쪽 스왑
        if (i + 1 < N && board[i][j] != board[i + 1][j]) {
            swap(i, j, i + 1, j);
            checkColumn(j);
            checkLine(i);
            checkLine(i + 1);
            swap(i, j, i + 1, j);
        }
    }
}

        System.out.print(maxCount);

    }
    
    static void swap(int x1, int y1, int x2, int y2){
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    static void checkLine(int row) {
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (board[row][i] == board[row][i - 1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
    }

    static void checkColumn(int col) {
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (board[i][col] == board[i - 1][col]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
    }

}