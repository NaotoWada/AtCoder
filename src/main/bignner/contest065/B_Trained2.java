package main.bignner.contest065;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_Trained2 {

    public static void main(String[] args) {
        // 過去にやってたけど解きなおし。
        // ボタンの状態をSetか配列どちらで持つか違うはあるが、方針はほぼ変わらないっぽい
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] button = new int[n];
        for (int i = 0; i < n; i++) {
            button[i] = sc.nextInt();
        }

        int next = 1;
        boolean can = false;
        Set<Integer> pushed = new HashSet<>();
        while (true) {
            next = button[next - 1];
            if (pushed.contains(next)) {
                break;
            }

            if (next == 2) {
                can = true;
                break;
            }

            pushed.add(next);
        }

        if (can) {
            System.out.println(pushed.size() + 1);
        } else {
            System.out.println(-1);
        }
    }
}
