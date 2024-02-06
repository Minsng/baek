package ex.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dice = br.readLine();
        StringTokenizer st = new StringTokenizer(dice, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a != b && a != c && b != c) {
            int max;
            if (a < b) {
                if (b < c) {
                    max = c;
                } else {
                    max = b;
                }
            } else {
                if (a < c) {
                    max = c;
                } else {
                    max = a;
                }
            }
            System.out.println(max * 100);
        } else {
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            } else if (a == b || a == c) {
                System.out.println(1000 + a * 100);
            } else {
                System.out.println(1000 + b * 100);
            }
        }
    }
}
