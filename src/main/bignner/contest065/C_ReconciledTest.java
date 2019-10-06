package main.bignner.contest065;

import static org.junit.Assert.*;
import org.junit.Test;

public class C_ReconciledTest {

    @Test
    public void test1() {
        // example1
        long actual = C_Reconciled.solve(2, 2);
        assertEquals(8, actual);
    }

    @Test
    public void test2() {
        // example2
        long actual = C_Reconciled.solve(3, 2);
        assertEquals(12, actual);
    }

    @Test
    public void test2_1() {
        // example2-1
        long actual = C_Reconciled.solve(3, 3);
        assertEquals(72, actual);
    }

    @Test
    public void test2_2() {
        // example2-2 逆の場合
        long actual = C_Reconciled.solve(2, 3);
        assertEquals(12, actual);
    }

    @Test
    public void test3() {
        // example3
        long actual = C_Reconciled.solve(1, 8);
        assertEquals(0, actual);
    }

    @Test
    public void test4() {
        // example4
        long actual = C_Reconciled.solve(100000, 100000);
        assertEquals(530123477, actual);
    }
}
