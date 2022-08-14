import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;
        int num = 0;
        int cnt = 1;

        while (true) {
            if (n <= cnt) {
                break;
            } else {
                num += 6;
                cnt += num;
                l++;
            }
        }
        System.out.println(l);
    }
}

