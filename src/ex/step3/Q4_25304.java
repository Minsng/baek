package ex.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;

        while (cnt > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            cnt--;
        }
        System.out.println(total == sum ? "Yes" : "No");
    }
}
