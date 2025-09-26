import java.io.*;
import java.util.Stack;

public class Main_ch0605 {

    public void solution(String str){
        int cnt = 0, size = 0, laser = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '('){
                stack.push(i);
            } else{
                
                if(i-stack.peek() == 1 ){
                    stack.pop();
                    cnt += stack.size();
                } else{
                    cnt += 1;
                    stack.pop();
                }
            }
            
            
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) throws IOException {
        Main_ch0605 T = new Main_ch0605();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        T.solution(str);
    }
}
