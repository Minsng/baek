package ex.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        StringTokenizer st = new StringTokenizer(time, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int set = Integer.parseInt(br.readLine());

        if (m + set > 59) {
            h = h+(m+set)/60;
            if (h > 23) {
                h = h-24;
            }
            m = (m + set)%60;
            System.out.println(h + " " + m);
        } else {
            m = m + set;
            System.out.println(h + " " + m);
        }
    }
}
