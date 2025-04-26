import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int index = 0;
        int n = 0;
        while(N >=0){
            n = index*(index+1)/2;
            int result =(N-2) - (6*n);
            if(result >= 0){
                index++;
            } else{
                N = -1;
            }
        }
        System.out.println(index+1);
    }
}

// 2 2~ 
// 3 2+6(1)~
// 4 2+6(1+2)~
// 5 2+6(1+2+3)~
// 6 2+6(1+2+3+4)~