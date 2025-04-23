import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] pieces = {1,1,2,2,2,8};

        for(int i=0; i<6; i++){
            pieces[i] = pieces[i] - Integer.parseInt(token.nextToken());
            sb.append(pieces[i]).append(" ");
        }
        System.out.println(sb.toString());

    }
}