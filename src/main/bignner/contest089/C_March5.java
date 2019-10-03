package main.bignner.contest089;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_March5 {

    static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("M", 0);
        map.put("A", 1);
        map.put("R", 2);
        map.put("C", 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[] march = new int[4];
        for (int i = 0; i < N; i++) {
            String initial = String.valueOf(sc.next().charAt(0));
            if (map.containsKey(initial)) {
                march[map.get(initial)]++;
            }
        }

        long ans = solve(N, march);

        System.out.println(ans);
    }

    public static long solve(int n, int[] march) {
        for (int i = 0; i < march.length; i++) {
            System.out.printf("%s ", march[i]);
        }
        System.out.println();

        long ans = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    int mi = march[i];
                    int mj = march[j];
                    int mk = march[k];
                    ans += (long) mi * mj * mk;
                    System.out.printf("%s %s %s = ans%s \n", mi, mj, mk, ans);
                }
            }
        }
        return ans;
    }
}
