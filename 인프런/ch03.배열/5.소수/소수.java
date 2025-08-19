import java.io.*;
import java.util.Arrays;

public class Main {
	
	public boolean isPrime(int n){
		if(n<2) return false;
		for(int i=2; i<=Math.sqrt(n);i++){
			if(n%i == 0) return false;
		}
		return true;
	}
	public void solution(int n){
		int answer =0;
		for(int i=2;i<=n;i++){
			if(isPrime(i)) answer ++;
		}
		System.out.println(answer);
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        T.solution(n);
    }
}