package ex.step3;

import java.io.*;

public class Q10_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= T; i++) {
            String spaces = " ".repeat(T - i);
            String stars = "*".repeat(i);
            bw.write(spaces + stars + "\n");
        }
        bw.flush();
        bw.close();
    }
}
