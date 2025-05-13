import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nstring = br.readLine();
        int N = Integer.parseInt(nstring);

        int[] arr = new int[10];

        for(int i=0; i<nstring.length();i++){
            arr[nstring.charAt(i)-'0'] ++;
        }
        
        StringBuilder result = new StringBuilder();
        for(int i=9; i>=0; i--){
            if(result.length() == nstring.length()){
                break;
            }
            while(arr[i]>0){
                result.append(i);
                arr[i] --;
            }
            
        }
        System.out.print(result);
    }
}