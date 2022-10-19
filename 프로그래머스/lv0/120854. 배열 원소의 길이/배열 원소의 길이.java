class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int cnt = 0;
        for(int i = 0; i < strlist.length; i++) {
            for (int j = 0; j < strlist[i].length(); j++) {
                cnt += 1; 
                answer[i] = cnt;
            }
        cnt = 0;
        }
        return answer;
    }
}