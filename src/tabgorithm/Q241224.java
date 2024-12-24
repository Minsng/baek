package tabgorithm;

import java.util.*;

/**
 * 편의점 음료수 진열 순서 맞추기
 * 편의점에는 다양한 음료수가 있습니다. 이 음료수들은 정해진 순서(목표 순서)로 진열대에 배치되어야 합니다.
 * 음료수는 다음과 같은 방식으로 진열할 수 있습니다:
 * 창고에서 음료수를 꺼내 진열대에 넣습니다. (PUSH)
 * 진열대에서 음료수를 빼냅니다. (POP)
 * 목표 순서대로 음료수를 진열하기 위해 필요한 작업을 기록하고, 진열이 불가능한 경우 "NO"를 출력하는 프로그램을 작성하세요.
 * 입력 형식
 * 첫 번째 줄에 진열할 음료수의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
 * 두 번째 줄에 공백으로 구분된 N개의 음료수 번호가 목표 순서로 주어진다.
 * 출력 형식
 * 진열 순서를 만들기 위한 PUSH와 POP 작업을 한 줄에 하나씩 출력한다.
 * 진열 순서를 만들 수 없는 경우 "NO"를 출력한다.
 */
public class Q241224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        List<String> results = organizeDrinks(N, arr);
        if (results.contains("NO")) {
            System.out.println("NO");
        } else {
            for (String action : results) {
                System.out.println(action);
            }
        }
    }

    public static List<String> organizeDrinks(int n, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        List<String> results = new ArrayList<>();
        int current = 1;

        for (int drink : arr) {
            while (current <= drink) {
                stack.push(current);
                results.add("PUSH");
                current++;
            }
            if (!stack.isEmpty() && stack.peek() == drink) {
                stack.pop();
                results.add("POP");
            } else {
                return Collections.singletonList("NO");
            }
        }
        return results;
    }

}
