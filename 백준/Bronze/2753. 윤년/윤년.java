import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if((a%4 == 0 && a%100 != 0) || a%400 == 0){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}