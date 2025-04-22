import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long year = Long.parseLong(br.readLine());

        System.out.println(year-543);
    }
}