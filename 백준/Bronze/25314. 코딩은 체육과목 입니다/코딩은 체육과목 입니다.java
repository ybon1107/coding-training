import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< N/4; i++){
            sb.append("long ");
        }
        sb.append("int");

        String result = sb.toString();
        System.out.println(result);
    }
}