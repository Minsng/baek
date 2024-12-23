package ex.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Q8_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
