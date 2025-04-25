import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i< N; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }

        int index = 0;
        int findIndex = 1;
        while(index<N){
            while(findIndex>0 && findIndex<N){
                if(arr[findIndex]<arr[findIndex-1]){
                    int temp = arr[findIndex];
                    arr[findIndex] = arr[findIndex-1];
                    arr[findIndex-1] = temp;
                }
                findIndex --;
            }
            index ++;
            findIndex = index+1;
        }
        int total = 0;
        for(int j=0; j<N; j++){
            total += arr[j] * (N-j);
        }

        System.out.println(total);

    }
}
