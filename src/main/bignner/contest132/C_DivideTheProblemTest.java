package main.bignner.contest132;

import static org.junit.Assert.*;
import org.junit.Test;

public class C_DivideTheProblemTest {

    @Test
    public void test() {
        int n = 100000;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                d[i] = 1;
            } else {
                d[i] = 100000;
            }
        }
        int actual = C_DivideTheProblem2.solve(n, d);
        System.out.println();
    }

    @Test
    public void test2() {
        int n = 6;
        int[] d = { 9, 1, 4, 4, 6, 7 };
        int actual = C_DivideTheProblem2.solve(n, d);
        assertEquals(2, actual);
    }

}
