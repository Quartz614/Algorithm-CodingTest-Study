class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String replace = "";
        replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuwxyz]","");
        String[] arr = replace.split("");
        
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}