import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int reverse_a = 0;
        int reverse_b = 0;

        while (a != 0) {
            int digit = a % 10;
            reverse_a = reverse_a * 10 + digit;
            a /= 10;
        }
        while (b != 0) {
            int digit = b % 10;
            reverse_b = reverse_b * 10 + digit;
            b /= 10;
        }
        if (reverse_a > reverse_b) {
            System.out.println(reverse_a);
        } else {
            System.out.println(reverse_b);
        }
    }
}