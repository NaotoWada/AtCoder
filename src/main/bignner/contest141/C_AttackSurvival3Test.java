package main.bignner.contest141;

import org.junit.Test;

public class C_AttackSurvival3Test {

    @Test
    public void test1() {
        int N = 6;
        long K = 3;
        int Q = 4;
        int[] A = { 3, 1, 3, 2 };
        String solve = C_AttackSurvival3.solve(N, Q, K, A);
        System.out.println(solve);
    }

    @Test
    public void test2() {
        int N = 6;
        long K = 5;
        int Q = 4;
        int[] A = { 3, 1, 3, 2 };
        String solve = C_AttackSurvival3.solve(N, Q, K, A);
        System.out.println(solve);
    }

    @Test
    public void test3() {
        int N = 10;
        long K = 13;
        int Q = 15;
        int[] A = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9 };
        String solve = C_AttackSurvival3.solve(N, Q, K, A);
        System.out.println(solve);
    }

}
