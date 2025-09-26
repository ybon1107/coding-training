import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main_ch0501 {

    public void solution(int n, String vote){
        HashMap<String, Integer> map = new HashMap<>();

        for(char a : vote.toCharArray()){
            map.put(Character.toString(a),map.getOrDefault(Character.toString(a), 0)+1);
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);
    }
    public static void main(String[] args) throws IOException {
        Main_ch0501 T = new Main_ch0501();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String vote = br.readLine();

        T.solution(n, vote);

    }

}
