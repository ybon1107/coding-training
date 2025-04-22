import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String[] tokens = line.split(" ");

        Long a = Long.parseLong(tokens[0]);
        Long b = Long.parseLong(tokens[1]);

        System.out.println(a-b);
    }
}