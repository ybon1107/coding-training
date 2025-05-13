import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10001];

        for(int i=0; i<N; i++){
            count[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for(int i=0; i< 10001; i++){
            while(count[i]>0){
                bw.write(i+"\n");
                count[i] --;
            }
        }

        bw.flush();
        bw.close();
    }
}