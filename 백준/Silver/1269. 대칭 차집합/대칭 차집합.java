import java.io.*;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());

        Set<Integer> total = new HashSet<>();
        StringTokenizer tokenA = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++){
            total.add(Integer.parseInt(tokenA.nextToken()));
        }
        
        StringTokenizer tokenB = new StringTokenizer(br.readLine());
        for(int i=0; i<B; i++){
            int element = Integer.parseInt(tokenB.nextToken());
            if(total.contains(element)){
                total.remove(element);
            } else{
                total.add(element);
            }
        }

        System.out.println(total.size());


    }
}