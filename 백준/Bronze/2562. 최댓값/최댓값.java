import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0; i<9; i++){
            int num = Integer.parseInt(br.readLine());
            if(max<num){
                max = num;
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}