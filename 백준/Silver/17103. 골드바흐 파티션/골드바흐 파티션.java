import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        sieve();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (isPrime[i] && isPrime[n - i]) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }

    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
