package com.inflearn;
import java.io.*;
public class Main {

	public void solution(int n, int m, int[][] students){
		int answer = 0;
		for(int i=1;i<n+1;i++){
			for(int j=1;j<n+1;j++){
				if(i == j) continue;
				int cnt = 0;
				for(int k=0;k<m;k++){
					int pi=0, pj=0;
					for(int s=0;s<n;s++){
						if(students[k][s] == i){
							pi = s;
						}
						if(students[k][s] ==j){
							pj = s;
						}
					}
					if(pi<pj) cnt ++;
				}
				if(cnt == m) answer ++;

			}
		}
		System.out.println(answer);

    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
		int n = Integer.parseInt(token[0]);
		int m = Integer.parseInt(token[1]);

		int[][] students = new int[m][n];
		for(int i=0;i<m;i++){
			String[] scores = br.readLine().split(" ");
			for(int j=0;j<n;j++){
				students[i][j] = Integer.parseInt(scores[j]);
			}
		}

        T.solution(n,m,students);
    }
}