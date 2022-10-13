class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int sum = (n * 12000) + ((k - service) * 2000);
          return sum;
    }
}