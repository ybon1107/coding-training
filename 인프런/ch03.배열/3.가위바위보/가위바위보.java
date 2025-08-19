import java.io.*;
  
public class Main {
    public void solution(int[] a, int[] b){

        for(int i=0; i<a.length;i++){
            if(a[i]==b[i]){
                System.out.println("D");
            } else {
                if(a[i] == 1){
                    if(b[i] == 2) System.out.println("B");
                    else System.out.println("A");
                } else if(a[i] == 2){
                    if(b[i] == 3) System.out.println("B");
                    else System.out.println("A");
                } else{
                    if(b[i] == 1) System.out.println("B");
                    else System.out.println("A");
                }
            }
        }
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] aToken = br.readLine().split(" ");
        String[] bToken = br.readLine().split(" ");
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(aToken[i]);
            b[i] = Integer.parseInt(bToken[i]);
        }
        T.solution(a,b);
    }
}