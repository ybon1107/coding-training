import java.io.*;

public class Main_ch0405 {

    public void solution(int n){
        int num = 0;
        int sum = 0;
        int lt = 1;
        int cnt = 0;
        if(n%2 == 0) num = n/2;
        else num = n/2+1;
        for(int rt=1; rt<= num; rt++){
            sum += rt;
            if(sum == n) cnt ++;
            while(sum >= n){
                sum -= lt++;
                if(sum == n ) cnt ++;
            }
        }

        System.out.println(cnt);

    }
    public static void main(String[] args) throws IOException {
        Main_ch0405 T = new Main_ch0405();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        T.solution(n);

    }
}