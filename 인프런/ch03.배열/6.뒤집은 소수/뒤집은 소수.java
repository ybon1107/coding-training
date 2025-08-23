import java.io.*;
public class Main {
	public boolean isPrime(int a){
		if( a == 1) return false;
		for(int i=2; i<=Math.sqrt(a);i++){
			if(a%i == 0) return false;
		}
		return true;
	}

	public void solution(String[] arr){
		boolean first = true;
		for(int i=0; i<arr.length; i++){
			StringBuilder sb = new StringBuilder(arr[i]);
			int a = Integer.parseInt(sb.reverse().toString());
			if(isPrime(a)){
				if(!first) System.out.print(" ");
				System.out.print(a);
				first = false;
			}
			
		}
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        T.solution(arr);
    }
}