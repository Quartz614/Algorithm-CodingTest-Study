import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> tmp = new ArrayList<>();
        
        while(true) {
            if (n < 3) {
                tmp.add(n);
                break;
            }
            tmp.add(n % 3);
            n = n / 3;
        }
        Collections.reverse(tmp);
        
        for (int i = 0; i < tmp.size(); i++) {
            answer += tmp.get(i) * Math.pow(3, i);
        }
        return answer;
    }
}