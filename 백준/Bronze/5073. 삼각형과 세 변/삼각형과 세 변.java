import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());
            int[] result = {a,b,c};
            Arrays.sort(result);

            if(a == 0){
                break;
            }
            if(result[0]==result[2]){
                System.out.println("Equilateral");
            } else if(result[2] < result[0]+result[1]){
                if(result[0]==result[1] || result[1]==result[2]){
                    System.out.println("Isosceles");
                } else{
                    System.out.println("Scalene");
                }
            } else{
                System.out.println("Invalid");
            }
        }
    }
}