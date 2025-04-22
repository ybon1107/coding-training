import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long totalPrice = Long.parseLong(br.readLine());

        int N = Integer.parseInt(br.readLine());

        long realPrice = 0L;
        for(int i = 0; i < N; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(token.nextToken());
            int count = Integer.parseInt(token.nextToken());
            realPrice += price*count;
        }

        String result = classifier(totalPrice, realPrice);
        System.out.println(result);
    }

    public static String classifier(long total, long real){
        return total == real ? "Yes" : "No";
    }
}