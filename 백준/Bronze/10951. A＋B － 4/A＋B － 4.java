import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line;
        while((line = br.readLine()) != null){
            StringTokenizer token = new StringTokenizer(line);

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            sb.append(a+b).append("\n");
        }
        System.out.println(sb.toString());
    }
}