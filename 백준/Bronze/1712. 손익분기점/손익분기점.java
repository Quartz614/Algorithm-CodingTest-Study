import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result;
        if (b >= c) {
            result = -1;
        } else {
            result = a / (c - b) + 1;
        }
        System.out.println(result);
    }
}

