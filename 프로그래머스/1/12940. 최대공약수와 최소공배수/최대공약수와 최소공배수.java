class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        return answer;
    }
    
    public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
    }
    // 3,12 -> 12,3 -> 3,0 -> 3
    // 2,5 -> 5,2 -> 2,1 -> 1,0 -> 1
    
    public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
    }
    // 3*12/3
    // 2*5/1
}