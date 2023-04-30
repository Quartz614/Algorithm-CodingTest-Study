import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        if (M >= 45) {
            M -= 45;
        } else {
            M += 15;
            H -= 1;
            if (H < 0) {
                H += 24;
            }
        }
        System.out.println(H + " " + M);
    }
}
