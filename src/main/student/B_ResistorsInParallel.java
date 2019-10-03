package main.student;

import java.util.Arrays;
import java.util.Scanner;

public class B_ResistorsInParallel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        String AN = sc.nextLine() + " ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            sb.append(AN);
        }

        int[] A = new int[N * K];
        String[] split = sb.toString().trim().split(" ");
        for (int i = 0; i < N * K; i++) {
            A[i] = Integer.parseInt(split[i]);
        }

        int[] bit = new int[N * K];
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[i]) {
                    bit[i]++;
                }
            }
        }

        int sum = Arrays.stream(bit).sum();
        if (sum > 1_000_000_000 + 7) {
            int ans = sum / (1_000_000_000 + 7);
            System.out.println(ans);
        } else {
            System.out.println(sum);
        }
    }
}


