import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> answerList = new ArrayList<>();
        Arrays.sort(arr);
        int index = 0;
        for(int element : arr){
            if(element%divisor == 0){
                answerList.add(element);
                index ++;
            }
        }
        if( index == 0 ){
            answerList.add(-1);
        }
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
        
    }
}