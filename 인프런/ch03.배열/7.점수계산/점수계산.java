package com.inflearn;
import java.io.*;
public class Main {

	public void solution(int n, String[] arr){
		int result =0;
		int score = 0;
		for(int i=0; i<n; i++){
			if(arr[i].equals("1")){
				score ++;
				result += score;
			} else{
				score = 0;
			}
		}
		System.out.println(result);
		
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        T.solution(n,arr);
    }
}