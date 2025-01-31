import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> li = new HashMap<>();
        String[] comb = null;
        for( String[] cloth : clothes){
            li.put(cloth[1], li.getOrDefault(cloth[1],0) + 1);
            
        }

        int combinations = 1;
        for (int count : li.values()) {
            combinations *= (count + 1);
        }
        return combinations-1;
    }
}