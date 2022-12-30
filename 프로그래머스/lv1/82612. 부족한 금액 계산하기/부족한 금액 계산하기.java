class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long tmp = 0;
        for (int i = 1; i <= count; i++) {
            tmp += price * i;
        }
        if (money > tmp) return 0;
        answer = tmp - money;

        return answer;
    }
}