import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int c = Integer.parseInt(token.nextToken());

        int max = a;
        if(a==b && b==c){
            System.out.println(10000+(a*1000));
        } else{
            if(a==b ||  a==c){
                System.out.println(1000+(a*100));
            } else if(b==c){
                System.out.println(1000+(b*100));
            } else {
                if(a<b || a<c){
                    if(b<c){
                        max = c;
                    } else{
                        max = b;
                    }
                }
                System.out.println(max*100);
            }
        }
    }
}