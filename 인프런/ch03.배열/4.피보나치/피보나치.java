import java.io.*;

public class Main {
	
	public void solution(int n){
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;

		for(int i=2;i<n;i++){
			answer[i] = answer[i-2] + answer[i-1];
		}

		for (int x : answer) {
        System.out.print(x + " ");
    	}
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        T.solution(n);
    }
}