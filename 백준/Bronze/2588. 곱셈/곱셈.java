import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());
        String b = br.readLine();

        int b1 = b.charAt(2)-'0';
        int b2 = b.charAt(1)-'0';
        int b3 = b.charAt(0)-'0';


        System.out.println(a*b1);
        System.out.println(a*b2);
        System.out.println(a*b3);
        System.out.println(a*Long.parseLong(b));
    }
}