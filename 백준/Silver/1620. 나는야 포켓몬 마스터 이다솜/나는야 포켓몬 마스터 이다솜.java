import java.io.*;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        String[] numToName = new String[N+1];
        Map<String,Integer> collection = new HashMap<>();

        for(int i=1; i<N+1; i++){
            String name = br.readLine();
            collection.put(name,i);
            numToName[i] = name;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                sb.append(numToName[Integer.parseInt(query)]).append("\n");
            } else{
                sb.append(collection.get(query)).append("\n");
            }
        }
        System.out.println(sb);
        
    }
}