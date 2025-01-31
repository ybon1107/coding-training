import java.util.HashMap;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer> li = new HashMap<>();
        int maxCount = 0;
        int mode = -1;
        boolean isDuplicate = false;
        
        for(int num : array){
            int count = li.getOrDefault(num,0)+1;
            if( count > maxCount){
                maxCount = count;
                mode = num;
                isDuplicate = false;
            } else if ( count == maxCount){
                isDuplicate = true;
            }
            li.put(num,count);
        }
        

        return isDuplicate ? -1:mode;
    }
}