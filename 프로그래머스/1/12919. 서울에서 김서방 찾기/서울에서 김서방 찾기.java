class Solution {
    public String solution(String[] seoul) {
        int region = 0;
        for(String name : seoul){
            if(name.equals("Kim")){
                break;
            }
            region ++;
        }
        
        String answer = "김서방은 " + region +"에 있다";
        return answer;
    }
}