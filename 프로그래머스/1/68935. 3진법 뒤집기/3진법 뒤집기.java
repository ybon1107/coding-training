class Solution {
    public int solution(int n) {
        // 45 % 3 = 0
        // 15 % 3 = 0
        // 5 % 3 = 2
        // 1 % 3 = 1
        // 0021 -> 0 * 3^3 + 0 * 3^2 + 2 * 3^1 + 1 * 3^0
        //((0* 3 + 0)* 3 + 2) * 3 + 1
        int answer = 0;
        while(n > 0){
            answer = answer * 3 + n % 3;
            n = n/3;
        }
        return answer;
    }
}