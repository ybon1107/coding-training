class Solution {
    public String solution(String s) {
        StringBuilder modifiedSentence = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                modifiedSentence.append(" ");
                wordIndex = 0;
            } else {
                if (wordIndex % 2 == 0) {
                    modifiedSentence.append(Character.toUpperCase(c));
                } else {
                    modifiedSentence.append(Character.toLowerCase(c));
                }
                wordIndex++; 
            }
        }
        return modifiedSentence.toString();
    }
}
