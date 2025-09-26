import java.io.*;
import java.util.HashMap;

public class Main_ch0503 {

    public void solution(int n, int k, int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        int cnt =0, lt =0;
        for(int rt = 0; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt],0) + 1);
            cnt ++;
            if(cnt == k){
                System.out.print(map.size() + " ");
                map.put(arr[lt],map.get(arr[lt])-1);
                if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
                lt ++;
                cnt --;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main_ch0503 T = new Main_ch0503();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
        int n = Integer.parseInt(token[0]);
        int k = Integer.parseInt(token[1]);

        String[] tokenArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(tokenArr[i]);
        }
        T.solution(n,k,arr);
    }
}
