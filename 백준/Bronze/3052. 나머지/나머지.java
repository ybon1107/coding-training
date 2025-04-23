import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] result = new boolean[42];
        int answer = 0;
        for(int i=0; i<10; i++){
            int a = Integer.parseInt(br.readLine());
            
            if (result[a%42]== false) {
                result[a%42] = true;
                answer ++;
            }
        }
        System.out.println(answer);
    }
}