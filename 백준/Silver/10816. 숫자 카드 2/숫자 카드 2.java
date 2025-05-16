import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        StringTokenizer tokenM = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cards = new HashMap<>();
        for(int i=0; i<M; i++){
            int card = Integer.parseInt(tokenM.nextToken());
            cards.put(card, cards.getOrDefault(card,0)+1);
        }

        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokenN = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int pick = Integer.parseInt(tokenN.nextToken());
            if(cards.get(pick) == null){
                sb.append(0).append(" ");
            } else{
                sb.append(cards.get(pick)).append(" ");
            }
            
        }
        System.out.println(sb);
    }
}