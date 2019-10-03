package main.japanstudent.contest01;

import static org.junit.Assert.*;
import org.junit.Test;

public class A_EqualWeightTest {

    @Test
    public void test1() {
        int n = 3;
        int m = 4;
        int[] a = { 1, 2, 4 };
        int[] b = { 3, 6, 10, 15 };
        int[] actual = A_EqualWeight.solve(n, m, a, b);
        int[] expect = { 0, 1, 2, 0 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test2() {
        int n = 3;
        int m = 3;
        int[] a = { 3, 2, 1, };
        int[] b = { 30, 20, 10 };
        int[] actual = A_EqualWeight.solve(n, m, a, b);
        int[] expect = { 0, 0, 0, 0 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test3() {
        int n = 100000;
        int m = 100000;
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            b[i] = i + 1000000;
        }
        int[] actual = A_EqualWeight.solve(n, m, a, b);
        int[] expect = { 0, 0, 0, 0 };
        assertArrayEquals(expect, actual);
    }
}
