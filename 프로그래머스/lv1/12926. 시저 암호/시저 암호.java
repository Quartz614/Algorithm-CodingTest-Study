import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += c;
                continue;
            }
            if (Character.isLowerCase(c)) {
                answer += (char) ((c - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                answer += (char)((c - 'A' + n) % 26 + 'A');
            }
        }
        return answer;
    }
}