import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(token.nextToken());
        int q = Integer.parseInt(token.nextToken());

        Set<Integer> set = new TreeSet<>();
        int sqrt = (int) Math.sqrt(p);

        for (int i = 1; i <= sqrt; i++) {
            if (p % i == 0) {
                set.add(i);
                set.add(p / i);
            }
        }

        List<Integer> result = new ArrayList<>(set);
        if (q <= result.size()) {
            System.out.println(result.get(q - 1));
        } else {
            System.out.println(0);
        }

    }
}
