import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String voca = br.readLine();
        boolean isTrue = true;
        for(int i=0; i<voca.length(); i++){
            if (voca.charAt(i) == voca.charAt(voca.length()-i-1)){
                continue;
            } else{
                isTrue = false;
                break;
            }
        }
        if (isTrue == true){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
        
    }
}