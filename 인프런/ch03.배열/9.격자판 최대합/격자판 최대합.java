import java.io.*;
public class Main {

	public void solution(int n, int[][] arr){
		int answer = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			int sum1=0;
			int sum2=0;
			for(int j=0;j<n;j++){
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer,sum1);
			answer = Math.max(answer,sum2);
		}
		int sum1 =0;
		int sum2 =0;
		for(int i=0;i<n;i++){

			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];

			answer = Math.max(answer,sum1);
			answer = Math.max(answer,sum2);
		}
		System.out.println(answer);
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			String[] token = br.readLine().split(" ");
			for(int j=0;j<n;j++){
				arr[i][j] = Integer.parseInt(token[j]);
			}
		}

        T.solution(n,arr);
    }
}