class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        String tmp = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                tmp = arr[i] + "";
                answer += tmp.toUpperCase();
            } else if ( arr[i] >= 65 && arr[i] <= 90) {
                tmp = arr[i] + "";
                answer += tmp.toLowerCase();
            }
        }
        return answer;
    }
}