import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            sum = 0;
            str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else if (str.charAt(j) =='X'){
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}