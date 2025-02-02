import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // String으로 바꾸고 내림차순으로 정렬?
        String[] num = new String[numbers.length];
        for(int i = 0; i<numbers.length;i++){
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, (a,b) -> (b+a).compareTo(a+b));
        String answer = "";
        for(String s: num){
            answer += s;
        }
        
        if(answer.charAt(0) == '0'){
            return "0";
        }
        return answer;
    }
}