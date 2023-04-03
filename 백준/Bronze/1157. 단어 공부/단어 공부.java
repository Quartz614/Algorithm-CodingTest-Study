import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            int str_char = str.charAt(i);
            if (97 <= str_char && str_char <= 122) {
                arr[str_char - 97]++;
            } else {
                arr[str_char - 65]++;
            }
        }
        int max = -1;
        char idx = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = (char) (i + 65);
            } else if (arr[i] == max) {
                idx = '?';
            }
        }
        System.out.println(idx);
    }
}
