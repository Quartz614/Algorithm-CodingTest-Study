import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            int mid = (arr.length / 2);
            if (a >= arr[mid]) {
                for (int j = mid; j < arr.length; j++) {
                    if (arr[j] == a) {
                        result[i] = 1;
                        break;
                    }
                }
            } else {
                for (int j = mid - 1; j >= 0; j--) {
                    if (arr[j] == a) {
                        result[i] = 1;
                        break;
                    }
                }
            }
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
