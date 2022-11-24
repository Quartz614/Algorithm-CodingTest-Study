class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (divisorCount(i) % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        
        return answer;
    }
      public static int divisorCount(int num)
    {
        int count = 0;
        int i = 1;
        while(i <= num)
        {
            if(num % i == 0)
                count += 1;
            i++;
        }
        return count;
    }
}