package com.inflearn;
import java.io.*;
public class Main {

	public void solution(int n, int m, int[] Aarr, int[] Barr){

		int indexA = 0;
		int indexB = 0;
		int[] answer = new int[n+m];
		int idx = 0;
		boolean over = true;
		while(indexA<n && indexB<m){
			if(Aarr[indexA]<Barr[indexB]){
				answer[idx] = Aarr[indexA];
				indexA ++;
			} else {
				answer[idx] = Barr[indexB];
				indexB ++;
			}
			idx ++;
		}
		if(indexA == n){
			for(int i=indexB; i<m;i++){
				answer[idx] = Barr[i];
				idx ++;
			}
		} else{
			for(int j=indexA; j<n;j++){
				answer[idx] = Aarr[j];
				idx ++;
			}
		}
		for(int i=0;i<n+m;i++){
			System.out.print(answer[i]+" ");
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