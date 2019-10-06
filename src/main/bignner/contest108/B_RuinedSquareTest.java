package main.bignner.contest108;

import static org.junit.Assert.*;
import org.junit.Test;

public class B_RuinedSquareTest {

    @Test
    public void test1() {
        // 入力例1．x軸が同値
        int[] actual = B_RuinedSquare.solve(0, 0, 0, 1);
        int[] expect = { -1, 1, -1, 0 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test2() {
        // 入力例2．xが右向きに遷移
        int[] actual = B_RuinedSquare.solve(2, 3, 6, 6);
        int[] expect = { 3, 10, -1, 7 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test3() {
        // 入力例3．xが左向きに遷移
        int[] actual = B_RuinedSquare.solve(31, -41, -59, 26);
        int[] expect = { -126, -64, -36, -131 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test4_0() {
        // y軸が同値 xは左向き
        int[] actual = B_RuinedSquare.solve(1, 0, -1, 0);
        int[] expect = { -1, -2, 1, -2 };
        assertArrayEquals(expect, actual);
    }


    @Test
    public void test4_1() {
        // y軸が同値 xが右向き
        int[] actual = B_RuinedSquare.solve(-1, 0, 1, 0);
        int[] expect = { 1, 2, -1, 2 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test5_0() {
        // xの最大値 xが同値でyが上遷移
        int[] actual = B_RuinedSquare.solve(100, -100, 100, 100);
        int[] expect = { -100, 100, -100, -100 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test5_1() {
        // xの最大値 xが同値でyが下遷移
        int[] actual = B_RuinedSquare.solve(100, 100, 100, -100);
        int[] expect = { 300, -100, 300, 100 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test6_0() {
        // xyの最大値 右向き
        int[] actual = B_RuinedSquare.solve(-100, -100, 100, 100);
        int[] expect = { -100, 300, -300, 100 };
        assertArrayEquals(expect, actual);
    }

    @Test
    public void test6_1() {
        // xyの最大値 左向き
        int[] actual = B_RuinedSquare.solve(100, 100, -100, -100);
        int[] expect = { 100, -300, 300, -100 };
        assertArrayEquals(expect, actual);
    }
}
