package main.bignner.contest063;

import static org.junit.Assert.*;
import org.junit.Test;

public class D_WidespreadTest {

    @Test
    public void test1() {
        int n = 4;
        int a = 5;
        int b = 3;
        int[] hn = { 8, 7, 4, 2 };
        long actual = D_Widespread3.solve(n, a, b, hn);
        assertEquals(2, actual);
    }

    @Test
    public void test2() {
        int n = 2;
        int a = 10;
        int b = 4;
        int[] hn = { 20, 20 };
        long actual = D_Widespread3.solve(n, a, b, hn);
        assertEquals(4, actual);
    }

    @Test
    public void test3() {
        int n = 5;
        int a = 2;
        int b = 1;
        int[] hn = { 900000000, 900000000, 1000000000, 1000000000, 1000000000 };
        long actual = D_Widespread3.solve(n, a, b, hn);
        assertEquals(800000000, actual);
    }
}
