import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        char tmp;

        for (int i = 0; i < s.length(); i++) {
            tmp = s.charAt(i);
            if (tmp >= 'A' && tmp <= 'C') {
                cnt += 3;
            } else if (tmp >= 'D' && tmp <= 'F') {
                cnt += 4;
            } else if (tmp >= 'G' && tmp <= 'I') {
                cnt += 5;
            } else if (tmp >= 'J' && tmp <= 'L') {
                cnt += 6;
            } else if (tmp >= 'M' && tmp <= 'O') {
                cnt += 7;
            } else if (tmp >= 'P' && tmp <= 'S') {
                cnt += 8;
            } else if (tmp >= 'T' && tmp <= 'V') {
                cnt += 9;
            } else if (tmp >= 'W' && tmp <= 'Z') {
                cnt += 10;
            }
        }
        System.out.println(cnt);
    }
}