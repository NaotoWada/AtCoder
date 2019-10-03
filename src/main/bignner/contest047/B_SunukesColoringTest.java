package main.bignner.contest047;

import static org.junit.Assert.*;
import org.junit.Test;

public class B_SunukesColoringTest {

    @Test
    public void test() {
        int w = 5;
        int h = 4;
        int n = 2;
        int[][] query = { { 2, 1, 1, }, { 3, 3, 4 } };
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(9, actual);
    }

    @Test
    public void test2() {
        int w = 5;
        int h = 4;
        int n = 3;
        int[][] query = { { 2, 1, 1, }, { 3, 3, 4 }, { 1, 4, 2 } };
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(0, actual);
    }

    @Test
    public void test3() {
        int w = 10;
        int h = 10;
        int n = 5;
        // @formatter:off
        int[][] query = {
                { 1, 6, 1 },
                { 4, 1, 3 },
                { 6, 9, 4 },
                { 9, 4, 2 },
                { 3, 1, 3 }};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(64, actual);
    }

    @Test
    public void test4() {
        int w = 1;
        int h = 1;
        int n = 1;
        // @formatter:off
        int[][] query = {{0, 0, 1}};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(1, actual);
    }

    @Test
    public void test5() {
        int w = 100;
        int h = 100;
        int n = 1;
        // @formatter:off
        int[][] query = {{1, 1, 1}};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(9900, actual);
    }

    @Test
    public void test6() {
        int w = 100;
        int h = 100;
        int n = 2;
        // @formatter:off
        int[][] query = {{ 1, 1, 1 },
                          { 1, 1, 2 }};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(0, actual);
    }

    @Test
    public void test7() {
        int w = 100;
        int h = 100;
        int n = 2;
        // @formatter:off
        int[][] query = {{ 1, 1, 1 },
                          { 2, 1, 2 }};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(100, actual);
    }

    @Test
    public void test8() {
        int w = 100;
        int h = 100;
        int n = 2;
        // @formatter:off
        int[][] query = {{ 1, 1, 3 },
                          { 1, 1, 3 }};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(9900, actual);
    }

    @Test
    public void test9() {
        int w = 100;
        int h = 100;
        int n = 2;
        // @formatter:off
        int[][] query = {{ 1, 1, 3 },
                          { 1, 1, 4 }};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(0, actual);
    }

    @Test
    public void test10() {
        int w = 100;
        int h = 100;
        int n = 2;
        // @formatter:off
        int[][] query = {{ 499, 1, 3 },
                          { 501, 1, 4 }};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(0, actual);
    }

    @Test
    public void test11() {
        int w = 5;
        int h = 5;
        int n = 2;
        // @formatter:off
        int[][] query = {{ 1, 3, 3 },
                          { 1, 3, 4 }};
        // @formatter:on
        int actual = B_SunukesColoring2.solve(w, h, n, query);
        assertEquals(0, actual);
    }
}
