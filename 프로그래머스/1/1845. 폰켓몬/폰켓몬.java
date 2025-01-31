import java.util.HashMap;
class Solution {
    int answer = 0;
    public int solution(int[] nums) {
        HashMap<Integer, Integer> li = new HashMap<>();
        for( int num : nums){
            li.put(num,li.getOrDefault(num,0)+1);
            if(answer < nums.length/2){
                if(li.get(num) == 1){
                    answer ++;
                } 
            } else{
                break;
            }
        }
        return answer;
    }
}