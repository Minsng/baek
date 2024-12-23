package tabgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q241220 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cards = new int[N];
        for (int i = 0; i < N; i++) cards[i] = Integer.parseInt(st.nextToken());
        System.out.println(minRemovalsToSort(N, cards));
    }

    public static int minRemovalsToSort(int n, int[] cards) {
        ArrayList<Integer> lis = new ArrayList<>();
        for(int card : cards) {
            int pos = Collections.binarySearch(lis, card);
            if (pos < 0) pos = -(pos + 1);
            if (pos == lis.size()) {
                lis.add(card);
            } else {
                lis.set(pos, card);
            }
        }
        return n - lis.size();
    }
}
