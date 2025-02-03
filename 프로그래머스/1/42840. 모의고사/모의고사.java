import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] scores = new int[3];
        for(int i=0;i<answers.length;i++){
            if( answers[i] == first[i%first.length]){
                scores[0] ++;
            }
            if(answers[i] == second[i%second.length]){
                scores[1]++;
            }
            if(answers[i] == third[i%third.length]){
                scores[2]++;
            }
        }
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> maxIndices = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                maxIndices.add(i + 1); 
            }
        }

        
        return maxIndices.stream().mapToInt(i -> i).toArray();
    }
}