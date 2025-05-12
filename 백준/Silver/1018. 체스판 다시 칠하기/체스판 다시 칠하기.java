import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        String[] chess = new String[N];

        for(int i=0; i<N; i++){
            chess[i] = br.readLine();
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<= N-8; i++){
            for(int j=0; j<= M-8; j++){
                int countW = 0;
                int countB = 0;
                for(int x=i; x<i+8; x++){
                    for(int y=j; y<j+8; y++){
                        boolean shouldBeWhite = (x + y) % 2 == 0;
                        char actual = chess[x].charAt(y);

                        if (shouldBeWhite) {
                            if (actual != 'W') countW++;
                            if (actual != 'B') countB++;
                        } else {
                            if (actual != 'B') countW++;
                            if (actual != 'W') countB++;
                        }
                    }
                }
                min = Math.min(min, Math.min(countW, countB));
            }
        }
        System.out.println(min);

    }
}