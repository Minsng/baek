package tabgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Q241227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] sales = new int[n];
//        for (int i = 0; i < n; i++) {
//            sales[i] = sc.nextInt();
//        }
        int[] sales = {100, 200, 150, 120, 130, 170, 80, 90, 200, 300, 250, 400};
        System.out.println(Arrays.toString(sales));

        int[] prefixSums = calculatePrefixSums(sales);

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println(querySum(prefixSums, L, R));
        }
    }

    public static int[] calculatePrefixSums(int[] sales) {
        int[] prefixSums = new int[sales.length + 1];
        for (int i = 1; i <= sales.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + sales[i - 1];
        }
        return prefixSums;
    }

    public static int querySum(int[] prefixSums, int L, int R) {
        return prefixSums[R] - prefixSums[L - 1];
    }
}
