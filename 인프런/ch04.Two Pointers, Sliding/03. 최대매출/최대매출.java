package com.inflearn;
import java.io.*;
import java.util.Arrays;

public class Main {

	public void solution(int n, int k, int[] arr){
		int si = 0;
		int ei = k;
		int answer = Integer.MIN_VALUE;
		while(ei<n){
			int val = 0;
			for(int i=si;i<ei;i++){
				val += arr[i];
			}
			if(answer<val) answer = val;
			si ++;
			ei ++;
		}
		System.out.println(answer);
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String[] token = br.readLine().split(" ");
		int n = Integer.parseInt(token[0]);
		int k = Integer.parseInt(token[1]);
		int[] arr = new int[n];
		String[] arrtoken = br.readLine().split(" ");
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(arrtoken[i]);
		}

        T.solution(n,k,arr);
    }
}