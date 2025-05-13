import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            int element = Integer.parseInt(token.nextToken());
            arr[i] = element;
            set.add(element);
        }
        
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.size(); i++) {
            map.put(sorted.get(i), i);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb);

    }
}