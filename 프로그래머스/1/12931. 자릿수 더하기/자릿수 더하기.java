import java.util.*;

public class Solution {
    public int solution(int n) {
        String a = String.valueOf(n);
        int[] list = new int[a.length()];
        int num = 0;
        for(int i =0; i<a.length();i++){
            char c = a.charAt(i);
            int dt = Integer.parseInt(String.valueOf(c));
            list[num] = dt;
            num++;
            System.out.println(dt);
        }
        int answer = Arrays.stream(list).sum();
        return answer;
        
    }
}