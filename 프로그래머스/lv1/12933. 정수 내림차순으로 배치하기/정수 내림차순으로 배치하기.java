import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String number = Long.toString(n);
    
        String arr[] = new String[number.length()];
        for (int i = 0; i < number.length(); i++){
            arr[i] = number.substring(i, i + 1);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        String result = "";
        for (String i : arr) {
            result += i;
        }
        return Long.parseLong(result);
    }
}