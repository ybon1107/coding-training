import java.io.*;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[5][15];
        for(int i=0; i<5; i++){
            arr[i] = br.readLine().toCharArray();
        }

        for(int j=0; j<15; j++){
            for(int k=0; k<5; k++){
                if(arr[k].length> j){
                    sb.append(arr[k][j]);
                }  
            }
        }
        System.out.println(sb.toString());
        
    }
}