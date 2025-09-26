import java.io.*;
import java.util.Stack;

public class Main_ch0604 {

    public void solution(String str){
        Stack<Integer> stack = new Stack<>();
        int tmp = 0;
        for(char s : str.toCharArray()){
            if(Character.isDigit(s)){
                stack.push(s - '0');
            } else{
                int b = stack.pop();
                int a = stack.pop();
                switch (s) {
                    case '+':
                        tmp = a + b;
                        break;
                    case '-':
                        tmp = a - b;
                        break;
                    case '*':
                        tmp = a * b;
                        break;
                    case '/':
                        tmp = a / b;
                        break;
                }
                stack.push(tmp);
            }
        }
        System.out.println(stack.get(0));
    }
    public static void main(String[] args) throws IOException{
        Main_ch0604 T = new Main_ch0604();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        T.solution(str);
    }
    
}