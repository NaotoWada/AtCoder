package main.bignner.contest136;

import static org.junit.Assert.*;
import org.junit.Test;

public class C_BuildStairsTest {

    @Test
    public void test() {
        int n = 100000;
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = 1000000000;
        }
        assertEquals("Yes", C_BuildStairs3.solve(n, h));
    }

    @Test
    public void test2() {
        int n = 100000;
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = i;
        }
        h[99999] = 999999998;
        assertEquals("Yes", C_BuildStairs3.solve(n, h));
    }

    @Test
    public void test3() {
        int[] h = { 1, 2, 3, 4, 5, 4, 4, 5, 2 };
        int n = h.length;
        assertEquals("No", C_BuildStairs3.solve(n, h));
    }

    @Test
    public void test4() {
        int[] h = { 1, 2, 1, 1, 3 };
        int n = h.length;
        assertEquals("Yes", C_BuildStairs3.solve(n, h));
    }

    @Test
    public void test5() {
        int[] h = { 1, 3, 2, 1 };
        int n = h.length;
        assertEquals("No", C_BuildStairs3.solve(n, h));
    }

    @Test
    public void test6() {
        int[] h = { 1, 2, 3, 4, 5 };
        int n = h.length;
        assertEquals("Yes", C_BuildStairs3.solve(n, h));
    }

}
