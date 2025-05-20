import java.io.*;
import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int size = 1;

        Set<String> set = new HashSet<>();

        while(size<=S.length()){
            for(int i=0; i<S.length()-size+1; i++){
                set.add(S.substring(i,i+size));
            }
            size++;
        }
        System.out.println(set.size());
    }
}