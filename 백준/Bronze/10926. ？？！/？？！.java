import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder username = new StringBuilder(br.readLine());

        username.append("??!");

        System.out.println(username);
    }
}