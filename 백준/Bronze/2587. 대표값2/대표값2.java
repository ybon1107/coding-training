import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int total = 0;
        for(int i=0; i<5; i++){
            int element = Integer.parseInt(br.readLine());
            arr[i] = element;
            total += element;
        }
        Arrays.sort(arr);

        System.out.println(total/5);
        System.out.println(arr[2]);
    }
}