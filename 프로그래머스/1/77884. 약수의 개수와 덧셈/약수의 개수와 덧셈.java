class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right; i ++){
            if(i%Math.sqrt(i) == 0){
                answer -= i;
            } else{
                answer += i;
            }
            // int count = 0;
            // for(int j = 1 ; j * j <= i; j ++){
            //     if(i%j == 0){
            //         if(j*j == i){
            //             count += 1;
            //         }else{
            //             count += 2;
            //         }        
            //     }
            // }
            // if(count % 2 == 0){
            //     answer += i;
            // } else{
            //     answer -= i;
            // }
        }
        
        return answer;
    }
}