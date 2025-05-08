import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0, y = 0;
        for (int i = 0; i < 3; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            x ^= Integer.parseInt(token.nextToken());
            y ^= Integer.parseInt(token.nextToken());
        }

        System.out.println(x + " " + y);
    }
}