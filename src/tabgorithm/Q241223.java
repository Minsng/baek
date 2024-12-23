package tabgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 막대기 삼각형의 최대 개수
 * 르탄이는 여러 개의 막대기를 사용해 삼각형을 만들고자 합니다. 각 막대기의 길이는 주어지며, 이 막대기들로 만들 수 있는 서로 다른 삼각형의 최대 개수를 구하려고 합니다.
 *
 * 삼각형의 조건
 * 삼각형의 한 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다. (a+b > c)
 *
 * 모든 막대기를 반드시 사용할 필요는 없으며, 가능한 많은 삼각형을 만들어야 합니다.
 *
 * 동일한 조합으로 만든 삼각형은 하나로 간주합니다. (예: 변의 길이가 3, 4, 5인 삼각형과 4, 5, 3인 삼각형은 한 종류로 봄)
 *
 */
public class Q241223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxTriangle(arr));
    }

    public static int maxTriangle(int[] arr) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = arr.length-1; i >= 2; i--) {
            int c = arr[i];
            int a = 0;
            int b = i - 1;

            while (a < b) {
                if (arr[a] + arr[b] > c) {
                    count += b - a;
                    b--;
                } else {
                    a++;
                }
            }
        }
        return count;
    }
}
