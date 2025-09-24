package com.inflearn;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {

	public void solution(int n, int m, int[] Aarr, int[] Barr){
		int pa=0;
		int pb=0;
		Arrays.sort(Aarr);
		Arrays.sort(Barr);
		ArrayList<Integer> answer = new ArrayList<>();
		while(pa<n && pb<m){
			if(Aarr[pa]<Barr[pb]){
				pa ++;
			} else if(Aarr[pa]>Barr[pb]){
				pb ++;
			} else{
				answer.add(Aarr[pa]);
				pa ++;
				pb ++;
			}
		}

		for(int a : answer){
			System.out.print(a + " ");
		}
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
		String[] token = br.readLine().split(" ");
		int[] Aarr = new int[n];
		for(int i=0; i<n; i++){
			Aarr[i] = Integer.parseInt(token[i]);
		}

		int m = Integer.parseInt(br.readLine());
		String[] token2 = br.readLine().split(" ");
		int[] Barr = new int[m];
		for(int i=0; i<m; i++){
			Barr[i] = Integer.parseInt(token2[i]);
		}

        T.solution(n,m,Aarr,Barr);
    }
}