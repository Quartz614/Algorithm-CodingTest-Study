import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        int tmp = N;

        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;
            
            if ( tmp == N) {
                break;
            }
        }
        System.out.println(count);
    }
}

