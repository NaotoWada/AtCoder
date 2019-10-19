package main.bignner.contest143;

import static org.junit.Assert.*;
import org.junit.Test;

public class D_TrianglesTest {

    int NMAX = 2000;
    int LMAX = 1000;

    @Test
    public void test() {

        int n = NMAX;
        int[] l = make(n);
        int actual = D_Triangles2.solve(n, l);
        System.out.println(actual);
        assertEquals(10, actual);
    }

    @Test
    public void test2() {

        int n = 4;
        int[] l = { 4, 3, 1, 2 };
        int actual = D_Triangles2.solve(n, l);
        assertEquals(1, actual);
    }

    private int[] make(int n) {
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = i + 1;
        }
        return l;
    }

}
