import java.util.*;
class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(String.valueOf(ch));
        return sb.reverse().toString();
        
    }
}