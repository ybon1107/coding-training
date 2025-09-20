package com.inflearn;
import java.io.*;
import java.util.Arrays;
public class Main {

	public void solution(int n, int[][] students){
		boolean[][] friends = new boolean[n][n];
		int[] num = new int[n];
		for(int j=0;j<5;j++){
			int index = 0;
			for(int i=0;i<n;i++){
				for(int k=i+1;k<n;k++){
					if(students[i][j] == students[k][j] && friends[i][k] == false){
						friends[i][k] = true;
						friends[k][i] = true;
						num[i] ++;
						num[k] ++;
					}
				}
			}
		}
		maxIndex(num);
    }

	public void maxIndex(int[] num){
		int maxIndex = 0;
		int maxValue = num[0];
		for(int i=1;i<num.length;i++){
			if(maxValue< num[i]){
				maxValue = num[i];
				maxIndex = i;
			}
		}
		System.out.println(maxIndex+1);
	}

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

		int[][] students = new int[n][5];
		for(int i=0; i<n; i++){
			String token[] = br.readLine().split(" ");
			for(int j=0; j<5; j++){
				students[i][j] = Integer.parseInt(token[j]);
			}
		}
        T.solution(n,students);
    }
}