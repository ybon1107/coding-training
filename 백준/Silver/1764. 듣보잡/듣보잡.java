import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        Set<String> set = new HashSet<>();

        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for(int i=0;i<M; i++){
            String name = br.readLine();
            if(set.contains(name)){
                result.add(name);
            }
        }

        System.out.println(result.size());

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<result.size(); i++){
            sb.append(result.get(i)).append("\n");
        }
        System.out.println(sb);

    }
}