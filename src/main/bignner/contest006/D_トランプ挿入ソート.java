package main.bignner.contest006;

import java.util.Scanner;

public class D_トランプ挿入ソート {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] deck = new int[N];
        for (int i = 0; i < N; i++) {
            deck[i] = Integer.parseInt(sc.next());
        }

        int ans = 0;
        for (int i = 1; i < N; i++) {
            boolean isInsert = false;
            int j = i;
            while (j >= 1 && deck[j - 1] > deck[j]) {
                isInsert = true;
                int tmp = deck[j];
                deck[j] = deck[j - 1];
                deck[j - 1] = tmp;
                j--;
            }
            if (isInsert) {
                ans++;
                isInsert = false;
            }
        }
        System.out.println(ans);
    }
}
