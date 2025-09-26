import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Main_ch0505 {

    public void solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                for(int l=j+1; l<n;l++){
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int index = 0;
        for(int x: set){
            index ++;
            if(index == k) answer = x;
            
        }
        System.out.println(answer);

    }

    public static void main(String[] args) throws IOException{
        Main_ch0505 T = new Main_ch0505();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
        int n = Integer.parseInt(token[0]);
        int k = Integer.parseInt(token[1]);

        int[] arr = new int[n];
        String[] tokenArr = br.readLine().split(" ");
        for(int i=0;i <n; i++){
            arr[i] = Integer.parseInt(tokenArr[i]);
        }
        T.solution(n, k, arr);
    }
}
