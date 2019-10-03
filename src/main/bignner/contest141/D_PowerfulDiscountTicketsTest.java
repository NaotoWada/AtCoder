package main.bignner.contest141;

import static org.junit.Assert.*;
import org.junit.Test;

public class D_PowerfulDiscountTicketsTest {

    @Test
    public void test_queue() {
        int N = 100000;
        int K = 100000;
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = (long) Math.random() * 10000;
        }

        D_PowerfulDiscountTickets2.solve(N, K, A);
    }

    @Test
    public void test_sort() {
        int N = 100000;
        int K = 100000;
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = (long) Math.random() * 10000;
        }

        D_PowerfulDiscountTickets.solve(N, K, A);
    }

    @Test
    public void test1() {
        int N = 3;
        int K = 3;
        Long[] A = { 2L, 13L, 8L };

        long actual = D_PowerfulDiscountTickets2.solve(N, K, A);
        assertEquals(9, actual);
    }

    @Test
    public void test2() {
        int N = 4;
        int K = 4;
        Long[] A = { 1l, 9l, 3l, 5l };

        long actual = D_PowerfulDiscountTickets2.solve(N, K, A);
        assertEquals(6, actual);
    }


    @Test
    public void test3() {
        int N = 1;
        int K = 100000;
        Long[] A = { 1000000000l };

        long actual = D_PowerfulDiscountTickets2.solve(N, K, A);
        assertEquals(0, actual);
    }

    @Test
    public void test4() {
        int N = 10;
        int K = 1;
        Long[] A = { 1000000000l, 1000000000l, 1000000000l, 1000000000l, 1000000000l, 1000000000l,
                1000000000l, 1000000000l, 1000000000l, 1000000000l };

        long actual = D_PowerfulDiscountTickets2.solve(N, K, A);
        assertEquals(9500000000l, actual);
    }

}
