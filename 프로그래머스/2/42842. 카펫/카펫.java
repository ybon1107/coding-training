import java.util.*;
class Solution {
    int[] answer = {};
    public int[] solution(int brown, int yellow) {
        int extend = brown + yellow;
        List<int[]> arr = new ArrayList<>();
        for(int i = 1 ; i <= extend / 2; i ++){
            if(extend%i == 0){
                int height = i;
                int width = extend/i;
                arr.add(new int[]{width,height});
            }
        }
        for(int[] dimentions:arr){
            int width = dimentions[0];
            int height = dimentions[1];
            if( brown == (width * 2 + (height-2)*2)){
                answer = new int[]{width, height};
                break;
            }
        }
        return answer;
        
        
    }
}
