import java.io.*;
import java.util.*;
public class Main_ch0502 {
    public void solution(String a, String b){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        boolean answer = true;
        for (int i=0;i<a.length();i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0) + 1);
            map2.put(b.charAt(i),map2.getOrDefault(b.charAt(i),0) + 1);
        }

        for(char key: map.keySet()){
            if(map2.containsKey(key) && map2.get(key) == map.get(key)){
                continue;
            }
            else {
                answer = false;
                break;
            }
        }
        System.out.println(answer == true? "YES" : "NO");
    }
    public static void main(String[] args) throws IOException{

        Main_ch0502 T = new Main_ch0502();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        T.solution(a, b);
    }
}
