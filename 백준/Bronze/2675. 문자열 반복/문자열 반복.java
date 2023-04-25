import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken()); // 반복 횟수
            String s = st.nextToken(); // 문자열 S

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                for (int k = 0; k < r; k++) {
                    sb.append(c);
                }
            }

            System.out.println(sb.toString()); // 출력
        }

        br.close();
    }
}
