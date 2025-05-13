import java.io.*;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> arr = new HashSet<>();

        for(int i=0; i<N; i++){
            arr.add(br.readLine());
        }
        List<String> list = new ArrayList<>(arr);

        Collections.sort(list, (a,b) ->{
            if(a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for(String element : list){
            sb.append(element).append("\n");
        }
        System.out.println(sb);
    }
}