import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        String N = token.nextToken();
        int B = Integer.parseInt(token.nextToken());

        System.out.println(Integer.parseInt(N,B));

    }
}