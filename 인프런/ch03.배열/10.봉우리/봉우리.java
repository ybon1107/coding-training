package com.inflearn;
import java.io.*;
public class Main {

	public void solution(int n, int[][] mountains){
		int answer = 0;
		for(int i=1;i<n+1;i++){
			for(int j=1;j<n+1;j++){
				int left = mountains[i][j-1];
				int right = mountains[i][j+1];
				int up = mountains[i-1][j];
				int down = mountains[i+1][j];
				int center = mountains[i][j];

				if(left<center && right<center && up<center && down<center){
					answer ++;
				}
			}
		}
		System.out.println(answer);
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		int[][] mountains = new int[n+2][n+2];
		for(int i=1;i<n+1;i++){
			String[] token = br.readLine().split(" ");
			for(int j=1;j<n+1;j++){
				mountains[i][j] = Integer.parseInt(token[j-1]);
			}
		}

        T.solution(n,mountains);
    }
}