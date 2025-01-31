import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 전화번호와 다음 전화번호를 비교합니다.
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false; // 접두어가 존재하는 경우
                return answer;
            }
        }
        
        return answer; // 접두어가 존재하지 않는 경우
    }
}
