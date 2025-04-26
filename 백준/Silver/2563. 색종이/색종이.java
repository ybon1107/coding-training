import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        boolean[][] map = new boolean[100][100];

        for(int i=0; i<N; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(token.nextToken());
            int y1 = Integer.parseInt(token.nextToken());

            for(int j=x1; j<x1+10; j++){
                for(int k=y1; k<y1+10; k++){
                    map[j][k]= true;
                }
            }
        }

        int count = 0;
        for (int ii = 0; ii < 100; ii++) {
            for (int jj = 0; jj < 100; jj++) {
                if (map[ii][jj]) count++;
            }
        }
        System.out.println(count);
    }
}