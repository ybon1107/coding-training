class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] maximum_length = new int[sizes.length];
        int[] minimum_length = new int[sizes.length];
        int maximum = 0;
        int minimum = 0;
        for(int i = 0; i < sizes.length; i ++){
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);
            if(width > maximum){
                maximum = width;
            }
            if(height > minimum){
                minimum = height;
            }
        }
        
        return maximum*minimum;
    }
}