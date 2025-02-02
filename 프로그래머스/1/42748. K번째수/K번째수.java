import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        for (int[] command : commands){
            int[] a_array = new int[command[1]-command[0]+1];
            int index_num = command[0]-1;
            for(int j = 0; j<command[1]-command[0]+1;j++){
                a_array[j] = array[index_num];
                index_num ++;
            }
            Arrays.sort(a_array);
            answer[i] = a_array[command[2]-1];
            i++;
        }
        return answer;
    }
}