package main.gigacode2019;

import static org.junit.Assert.*;

import org.junit.Test;

public class F_Test {

    @Test
    public void test() { // sample
        int h = 1;
        int w = 10;
        int n = 3;
        int[][] rc = { { 1, 1, 1 }, { 1, 5, 8 } };

        int actual = F_.solve(h, w, n, rc);
        assertEquals(3, actual);
    }

    @Test
    public void test2() { // sample 末尾追加
        int h = 1;
        int w = 25;
        int n = 4;
        int[][] rc = { { 1, 1, 1, 1 }, { 1, 5, 8, 25 } };

        int actual = F_.solve(h, w, n, rc);
        assertEquals(3, actual);
    }

    @Test
    public void test3() { // nなし
        int h = 1;
        int w = 2;
        int n = 0;
        int[][] rc = new int[2][n];
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }

    @Test
    public void test3_1() { // nなし最大
        int h = 1;
        int w = 25;
        int n = 0;
        int[][] rc = new int[2][n];
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }

    @Test
    public void test4() { // 片端のみ begin
        int h = 1;
        int w = 2;
        int n = 1;
        int[][] rc = { { 1 }, { 1 } };
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }

    @Test
    public void test4_2() { // 片端のみ end
        int h = 1;
        int w = 2;
        int n = 1;
        int[][] rc = { { 1 }, { 2 } };
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }

    @Test
    public void test4_3() { // 片端のみ end
        int h = 1;
        int w = 25;
        int n = 1;
        int[][] rc = { { 1 }, { 25 } };
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }

    @Test
    public void test5() { // 両側のみ
        int h = 1;
        int w = 25;
        int n = 2;
        int[][] rc = { { 1, 1 }, { 1, 25 } };
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }

    @Test
    public void test5_2() { // 両側のみ
        int h = 1;
        int w = 25;
        int n = 24;
        int[][] rc = new int[2][n];
        for (int i = 0; i < n; i++) {
            rc[0][i] = 1;
            rc[1][i] = i + 1;
        }
        rc[0][13] = 0;
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }

    @Test
    public void test6() { // 全部埋め 最大
        int h = 1;
        int w = 25;
        int n = 25;
        int[][] rc = new int[2][n];
        for (int i = 0; i < n; i++) {
            rc[0][i] = 1;
            rc[1][i] = i + 1;
        }
        int actual = F_.solve(h, w, n, rc);
        assertEquals(0, actual);
    }

    @Test
    public void test7() { // 全埋め 最小
        int h = 1;
        int w = 2;
        int n = 2;
        int[][] rc = new int[2][n];
        for (int i = 0; i < n; i++) {
            rc[0][i] = 1;
            rc[1][i] = i + 1;
        }
        int actual = F_.solve(h, w, n, rc);
        assertEquals(0, actual);
    }

    @Test
    public void test8() {
        int h = 1;
        int w = 5;
        int n = 4;
        int[][] rc = { { 1, 1, 1, 1 }, { 1, 2, 3, 4 } };
        int actual = F_.solve(h, w, n, rc);
        assertEquals(1, actual);
    }
}
