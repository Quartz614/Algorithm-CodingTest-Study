import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            boolean isPrime = true;
            int a = in.nextInt();

            if(a == 1) {
                continue;
            }
            for(int j = 2; j <= Math.sqrt(a); j++) {
                if(a % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {	// 소수인경우 count 값 1 증가
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}