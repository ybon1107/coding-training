class Solution {
    int answer = 0;
    public int solution(String[] babbling) {
        for ( String voca : babbling){
            int index = 0;
            boolean possible = false;
            while(voca.length()-index >= 2){
                if(voca.length()-index >= 3 &&
                   (voca.substring(index, index + 3).equals("aya") ||
                   voca.substring(index, index + 3).equals("woo"))){
                    index = index +3;
                    possible = true ;
                } else if(voca.substring(index, index + 2).equals("ye") ||
                          voca.substring(index, index + 2).equals("ma")){
                    index = index +2;
                    possible= true;
                } else{
                    possible = false;
                    break;
                }
            }
            if(voca.length()-index > 0){
                possible = false;
            }
            if(possible){
                answer ++;
            }
        }
        return answer;
    }
}