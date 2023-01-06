class Solution {
    public int solution(int[][] sizes) {
        int finalMax = 0;
        int finalMin = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int[] size = sizes[i];
            
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            finalMax = Math.max(finalMax, max);
            finalMin = Math.max(finalMin, min);
        }
        return finalMax * finalMin;
    }
}