import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] nums = new boolean[30];

        for(int i=0; i<28; i++){
            int a = Integer.parseInt(br.readLine());
            nums[a-1] = true;
        }

        for(int i=0; i<30; i++){
            if (nums[i] == false) System.out.println(i+1);
        }
        
    }
}