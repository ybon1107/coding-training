import java.io.*;
import java.util.Stack;

public class Main_ch0602 {
    public void solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch != ')'){
                stack.push(ch);
            } else{
                if(stack.isEmpty()){
                    answer = "";
                    break;
                }
                while(stack.peek() != '('){
                    char a = stack.pop();                 
                }
                stack.pop();
            }
            
        }
        for(int i=0;i<stack.size();i++){
            System.out.print(stack.get(i));
        }
    }

    public static void main(String[] args) throws IOException{
        Main_ch0602 T = new Main_ch0602();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        T.solution(str);
    }
}
