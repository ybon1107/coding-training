import java.io.*;
import java.util.HashMap;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String voca = br.readLine().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<voca.length(); i++){
            char ch = voca.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int max = 0;
        char result = '?';

        for(char key : map.keySet()){
            int value = map.get(key);

            if(max<value){
                max=value;
                result = key;
            } else if(max==value){
                result = '?';
            }
        }
        System.out.println(result);
    }
}