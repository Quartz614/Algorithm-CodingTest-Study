class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int a = x;
        
        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }
        if (x % sum == 0) {
            return true;
        } else return false;
    }
}