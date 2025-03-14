import java.util.*;

class Solution {
    public int solution(String s) {
        String[] li = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int index = 0;
        StringBuilder answer = new StringBuilder();

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                answer.append(s.charAt(index));
                index++;
            } else {
                for (int i = 0; i < li.length; i++) {
                    if (s.startsWith(li[i], index)) {
                        answer.append(i);
                        index += li[i].length();
                        break;
                    }
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}
