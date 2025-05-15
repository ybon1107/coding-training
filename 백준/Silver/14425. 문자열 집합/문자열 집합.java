import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        Set<String> set = new HashSet<>();

        for(int i=0; i<N;i++){
            set.add(br.readLine());
        }
        int total =0;
        for(int i=0; i<M; i++){
            if(set.contains(br.readLine())){
                total++;
            }
        }
        System.out.println(total);
    }
}