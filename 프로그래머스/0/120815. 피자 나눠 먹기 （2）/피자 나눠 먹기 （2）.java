class Solution {
    public int solution(int n) {
        int answer = 0;

        // n을 최대공약수로 나눈 값
        int gcd_value = gcd(n,6);
        answer = n / gcd_value;
        
        return answer;
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}