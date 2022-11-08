class Solution {
    public String solution(String my_string) {
        String s = my_string.replaceAll("[aeiou]", "");
        return s;
    }
}
