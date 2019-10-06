package main.grand.contest039;

import static org.junit.Assert.*;
import org.junit.Test;

public class A_ConnectionAndDisconnectionTest {

    @Test
    public void test1() {
        // example1
        String s = "issii";
        long k = 2;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(4, actual);
    }

    @Test
    public void test1_1() {
        // example1
        String s = "issii";
        long k = 3;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(6, actual);
    }

    @Test
    public void test1_2() {
        // example1
        String s = "issii";
        long k = 4;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(8, actual);
    }

    @Test
    public void test2() {
        // example2
        String s = "qq";
        long k = 81;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(81, actual);
    }

    @Test
    public void test3() {
        // example3
        String s = "cooooooooonteeeeeeeeeest";
        long k = 999993333;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(8999939997L, actual);
    }

    @Test
    public void test4_0() {
        // 違う文字列を1回
        String s = "si";
        long k = 1;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(0, actual);
    }

    @Test
    public void test4_1() {
        // 違う文字列を2回
        String s = "si";
        long k = 2;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(0, actual);
    }

    @Test
    public void test4_2() {
        // 違う文字列を最大回
        String s = "si";
        long k = 1000000000;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(0, actual);
    }

    @Test
    public void test5_0() {
        // 同じ文字列を1回
        String s = "ss";
        long k = 1;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(1, actual);
    }

    @Test
    public void test5_1() {
        // 同じ文字列を1回
        String s = "ss";
        long k = 2;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(2, actual);
    }

    @Test
    public void test5_2() {
        // 同じ文字列を最大回
        String s = "ss";
        long k = 1000000000;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(1000000000, actual);
    }

    @Test
    public void test6_0() {
        // 最初と最後の文字を連結する場合で1回
        String s = "sssiss";
        long k = 1;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(2, actual);
    }

    @Test
    public void test6_1() {
        // 最初と最後の文字を連結する場合で2回
        String s = "sssiss";
        long k = 2;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(4, actual);
    }

    @Test
    public void test6_2() {
        // 最初と最後の文字を連結する場合で3回
        String s = "sssiss";
        long k = 3;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(6, actual);
    }

    @Test
    public void test3_1() {
        String s = "coon";
        long k = 1;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(1, actual);
    }

    @Test
    public void test3_2() {
        String s = "coon";
        long k = 2;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(2, actual);
    }

    @Test
    public void test11() {
        String s = "aaaaabbb";
        long k = 2;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(6, actual);
    }

    @Test
    public void test111() {
        String s = "aaaaabbba";
        long k = 2;
        long actual = A_ConnectionAndDisconnection.solve(s, k);
        assertEquals(7, actual);
    }
}
