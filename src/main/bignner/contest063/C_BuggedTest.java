package main.bignner.contest063;

import static org.junit.Assert.*;
import org.junit.Test;

public class C_BuggedTest {

    @Test
    public void test() {
        int n = 100;
        int[] sn = new int[n];
        for (int i = 0; i < n; i++) {
            sn[i] = 100;
        }
        int actual = C_Bugged.solve(n, sn);
        assertEquals(0, actual);
    }

    @Test
    public void test2() {
        int n = 100;
        int[] sn = new int[n];
        for (int i = 0; i < n; i++) {
            sn[i] = 99;
        }
        int actual = C_Bugged.solve(n, sn);
        assertEquals(9801, actual);
    }

    @Test
    public void test3() {
        int n = 100;
        int[] sn = new int[n];
        for (int i = 0; i < n; i++) {
            sn[i] = 5;
        }
        int actual = C_Bugged.solve(n, sn);
        assertEquals(495, actual);
    }

    @Test
    public void test4() {
        int n = 100;
        int[] sn = new int[n];
        for (int i = 0; i < n; i++) {
            sn[i] = 100;
        }
        sn[99] = 99;
        int actual = C_Bugged.solve(n, sn);
        assertEquals(9999, actual);
    }

    @Test
    public void test5() {
        int n = 5;
        int[] sn = { 10, 10, 15, 15, 20 }; // 貪欲中に10の倍数じゃないのが来る
        int actual = C_Bugged.solve(n, sn);
        assertEquals(55, actual); // 単純貪欲だと35になる
    }
}
