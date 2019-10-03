package main.bignner.contest142;

import static org.junit.Assert.*;
import org.junit.Test;

public class D_DisjointSetOfCommonDivisorsTest {

    @Test
    public void test() {
        long a = 12;
        long b = 18;
        long actual = D_DisjointSetOfCommonDivisors.solve(a, b);
        assertEquals(3, actual);
    }

    @Test
    public void test2() {
        long a = 420;
        long b = 660;
        long actual = D_DisjointSetOfCommonDivisors.solve(a, b);
        assertEquals(4, actual);
    }

    @Test
    public void test3() {
        long a = 2019;
        long b = 1;
        long actual = D_DisjointSetOfCommonDivisors.solve(a, b);
        assertEquals(1, actual);
    }

    @Test
    public void test4() {
        long a = 100000000000l;
        long b = 100000000000l;
        long actual = D_DisjointSetOfCommonDivisors.solve(a, b);
        assertEquals(1, actual);
    }

}
