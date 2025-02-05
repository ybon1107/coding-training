import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] selected;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt(); // 1부터 N까지 자연수 4
        M = scanner.nextInt(); // 길이가 M인 수열(중복 없이) 4
        
        selected = new int[M];
        visited = new boolean[N+1];
        
        generateCombinations(0);
        
        scanner.close();
    }
    static void generateCombinations(int depth) {
        if(depth == M){
            for(int i=0;i<M;i++){
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i<= N ; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[depth]=i;
                generateCombinations(depth+1);
                visited[i]=false;
            }
        }
    }
}
