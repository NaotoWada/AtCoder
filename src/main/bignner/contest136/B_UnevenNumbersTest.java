package main.bignner.contest136;

import static org.junit.Assert.*;
import org.junit.Test;

public class B_UnevenNumbersTest {

    @Test
    public void test() {
        int n = 1;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(1, actual);
    }

    @Test
    public void test2() {
        int n = 9;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(9, actual);
    }

    @Test
    public void test3() {
        int n = 10;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(9, actual);
    }

    @Test
    public void test4() {
        int n = 11;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(9, actual);
    }

    @Test
    public void test5() {
        int n = 136;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(46, actual);
    }

    @Test
    public void test6() {
        int n = 100;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(10, actual);
    }

    @Test
    public void test7() {
        int n = 200;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(110, actual);
    }

    @Test
    public void test8() {
        int n = 999;
        int actual = B_UnevenNumbers.solve(n);
        assertEquals(909, actual);
    }
}
