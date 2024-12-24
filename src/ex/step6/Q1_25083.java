package ex.step6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 새싹
 *          ,r'"7
 * r`-_   ,'  ,/
 *  \. ". L_r'
 *    `~\/
 *       |
 *       |
 */
public class Q1_25083 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] art = {
                "         ,r'\"7",
                "r`-_   ,'  ,/",
                " \\. \". L_r'",
                "   `~\\/",
                "      |",
                "      |"
        };

        for (String line : art) {
            bw.write(line);
            bw.newLine(); // 줄바꿈 추가
        }

        bw.flush();
        bw.close();
    }
}
