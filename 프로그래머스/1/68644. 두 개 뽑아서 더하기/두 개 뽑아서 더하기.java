import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int[] numbers) {
        // hashset 정의
        // 완전 탐색하면서 hashset에 넣기
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i < numbers.length; i ++){
            for(int j = i+1 ; j < numbers.length; j ++){
                int result = numbers[i] + numbers[j];
                set.add(result);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}