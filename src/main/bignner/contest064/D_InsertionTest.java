package main.bignner.contest064;

import static org.junit.Assert.*;
import org.junit.Test;

public class D_InsertionTest {

    @Test
    public void test() {
        assertEquals("(())", D_Insertion2.solve(3, "())"));
    }

    @Test
    public void test2() {
        assertEquals("(((()))())", D_Insertion2.solve(6, ")))())"));
    }

    @Test
    public void test3() {
        assertEquals("(((())))(((())))", D_Insertion2.solve(8, "))))(((("));
    }

    @Test
    public void test31() {
        assertEquals("()((((((()))))))", D_Insertion2.solve(8, ")((((((("));
    }

    @Test
    public void test4() {
        assertEquals("(())", D_Insertion2.solve(4, "(())"));
    }

    @Test
    public void test5() {
        assertEquals("((()))", D_Insertion2.solve(3, ")))"));
    }

    @Test
    public void test6() {
        assertEquals("((()))", D_Insertion2.solve(3, "((("));
    }

    @Test
    public void test7() {
        assertEquals("()", D_Insertion2.solve(1, "("));
    }

    @Test
    public void test8() {
        assertEquals("()", D_Insertion2.solve(1, ")"));
    }
}
