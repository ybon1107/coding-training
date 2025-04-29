import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = 1;
        int position;
        while(true){
            if((k*(k+1)/2)<N){
                k++;
            } else{
                position = N-(k*(k-1)/2);
                break;
            }
        }
        int a;
        int b;
        if(k%2==0){
            a = position;
            b = k-position+1;
        } else{
            a = k-position+1;
            b = position;
        }
        System.out.println(a + "/" + b);

    }
}