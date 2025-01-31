import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> result = new HashMap<>();
        
        // 참가자 수를 해시맵에 저장
        for (String part : participant) {
            result.put(part, result.getOrDefault(part, 0) + 1);
        }
        
        // 완주자 수를 해시맵에서 감소
        for (String comp : completion) {
            result.put(comp, result.get(comp) - 1);
        }
        
        // 완주하지 못한 참가자를 찾기
        for (String part : participant) {
            if (result.get(part) != null && result.get(part) > 0) {
                return part; // 완주하지 못한 참가자 반환
            }
        }
        
        return ""; // 기본적으로 빈 문자열 반환 (이론적으로 도달하지 않음)
    }
}
