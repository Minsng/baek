package ex.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Q9_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < T; i++) {
            for (int j = 0; j<=i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
