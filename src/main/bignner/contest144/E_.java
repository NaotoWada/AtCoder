package main.bignner.contest144;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class E_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }

        long ans = solve(n, k, a, f);
        System.out.println(ans);
    }

    private static long solve(int n, long k, int[] a, int[] f) {
        Queue<Integer> costQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            costQueue.add(a[i]);
        }

        Arrays.sort(f);

        int[] trainedTeam = training(k, costQueue);
        long ans = 0;
        for (int i = 0; i < trainedTeam.length; i++) {
            ans = Math.max(ans, trainedTeam[i] * f[i]);
        }

        return ans;
    }

    private static int[] training(long k, Queue<Integer> costQueue) {
        while (k > 0) {
            if (costQueue.peek() == 0) {
                break;
            }

            int pw = costQueue.poll();
            pw--;
            costQueue.add(pw);
            k--;
        }
        int[] ret = new int[costQueue.size()];
        for (int i = 0; i < costQueue.size(); i++) {
            ret[i] = costQueue.poll();
        }
        return ret;
    }
}
