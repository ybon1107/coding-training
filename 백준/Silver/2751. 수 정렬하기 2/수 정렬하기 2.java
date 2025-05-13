import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<N;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        br.close();

        Collections.sort(arr);

        for (int num : arr) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
    }
}