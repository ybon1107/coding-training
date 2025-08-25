import java.io.*;
import java.util.*;
public class Main {

	public void solution(int n, ArrayList<Integer> arr){
		int[] ranks = new int[n];
		for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr.get(j) > arr.get(i)) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
		for (int i = 0; i < n; i++) {
            System.out.print(ranks[i] + " ");
        }
		
    }

	public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
		ArrayList<Integer> scores = new ArrayList<>();
		for(int i=0; i<n ;i++){
			scores.add(Integer.parseInt(arr[i]));
		}

        T.solution(n,scores);
    }
}