import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 1;

        while(N>range){
            range += 6*count;
            count++;
        }
        System.out.println(count);
        
    }
}

// 1 1
// 2 2~ 
// 3 2+6(1)~
// 4 2+6(1)+6(2)~
// 5 2+6(1)+6(2)+6(3)~
// 6 2+6(1)+6(2)+6(3)+6(4)~