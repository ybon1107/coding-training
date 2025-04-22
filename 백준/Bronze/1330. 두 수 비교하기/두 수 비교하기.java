import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());

        if(a>b){
            System.out.println(">");
        }else if(a<b){
            System.out.println("<");
        } else{
            System.out.println("==");
        }
    }
}