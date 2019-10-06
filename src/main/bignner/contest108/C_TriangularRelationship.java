package main.bignner.contest108;

import java.util.Scanner;

public class C_TriangularRelationship {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 愚直に全探索すると正解にはなるけどTLE
        int ans = solve(n, k);
        System.out.println(ans);
    }

    static int solve(int N, int K) {
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {

                if (i + j < K || (i + j) % K != 0) {
                    continue;
                }

                for (int k = 1; k <= N; k++) {
                    if ((j + k >= K && (j + k) % K == 0) && (i + k >= K && (i + k) % K == 0)) {
                        System.out.printf("(%s, %s, %s)\n", i, j, k);
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

