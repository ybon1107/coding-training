import java.io.*;
import java.util.Stack;
public class Main_ch0601 {

    public void solution(String str){
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for(char s : str.toCharArray()){
            if(s == '('){
                stack.push('(');
            } else{
                if(stack.isEmpty()){
                    answer = "NO";
                    break;
                } else{
                    stack.pop();
                }
            }
        }
        
        System.out.println(answer);
        
    }
    public static void main(String[] args) throws IOException{
        Main_ch0601 T = new Main_ch0601();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        T.solution(str);
    }
}
