import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(token.nextToken());
        int y = Integer.parseInt(token.nextToken());
        int w = Integer.parseInt(token.nextToken());
        int h = Integer.parseInt(token.nextToken());

        int[] li = {x,y,Math.abs(w-x),Math.abs(h-y)};
        
        int min = Arrays.stream(li)
                        .min()
                        .orElse(0);
    
        System.out.println(min);
    }
}