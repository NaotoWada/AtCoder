package main.bignner.contest089;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;

public class C_March5Test {
    @After
    public void tearDown() {
        System.out.println();
    }

    @Test
    public void test() {
        int[] march = { 1, 1, 1, 0 };
        assertEquals(1, C_March5.solve(5, march));
    }

    @Test
    public void test2() {
        int[] march = { 2, 1, 1, 0 };
        assertEquals(2, C_March5.solve(5, march));
    }

    @Test
    public void test3() {
        int[] march = { 1, 1, 1, 1 };
        assertEquals(4, C_March5.solve(5, march));
    }

    @Test
    public void test4() {
        int[] march = { 2, 1, 1, 1 };
        assertEquals(7, C_March5.solve(5, march));
    }

    @Test
    public void test5() {
        int[] march = { 3, 1, 1, 1 };
        assertEquals(10, C_March5.solve(5, march));
    }

    @Test
    public void test6() {
        int[] march = { 2, 2, 1, 1 };
        assertEquals(12, C_March5.solve(5, march));
    }

    @Test
    public void test7() {
        int[] march = { 3, 3, 1, 1 };
        assertEquals(24, C_March5.solve(5, march));
    }

    @Test
    public void test8() {
        int[] march = { 2, 2, 2, 2 };
        assertEquals(32, C_March5.solve(5, march));
    }
}
