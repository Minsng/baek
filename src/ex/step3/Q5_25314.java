package ex.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()) / 4;

        while (n > 0) {
            n--;
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
