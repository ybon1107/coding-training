import java.io.*;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1){
                break;
            } else{
                int result = 1;
                Set<Integer> set = new TreeSet<>();
                StringBuilder sb = new StringBuilder();

                for(int i=2; i<=Math.sqrt(n);i++){
                    if(n%i == 0){
                        result += i;
                        result += n/i;
                        set.add(i);
                        set.add(n/i);
                    }                    
                }
                if(n == result){
                    sb.append(n).append(" = 1");
                    for(int num : set){
                        sb.append(" + ").append(num);
                    }
                    System.out.println(sb.toString());
                } else{
                    System.out.println(n + " is NOT perfect.");
                }
            }

        }
    }
}