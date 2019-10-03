package main.bignner.contest126;

import static org.junit.Assert.*;
import org.junit.Test;

public class BTest {

    @Test
    public void test99() {
        assertEquals(B_YYMMorMMYY.exec("1212"), "AMBIGUOUS");
    }

    @Test
    public void test98() {
        assertEquals(B_YYMMorMMYY.exec("1312"), "YYMM");
    }

    @Test
    public void test97() {
        assertEquals(B_YYMMorMMYY.exec("1213"), "MMYY");
    }

    @Test
    public void test96() {
        assertEquals(B_YYMMorMMYY.exec("1313"), "NA");
    }

    @Test
    public void test95() {
        assertEquals(B_YYMMorMMYY.exec("0012"), "YYMM");
    }

    @Test
    public void test1() {
        assertEquals(B_YYMMorMMYY.exec("0000"), "NA");
    }

    @Test
    public void test2() {
        assertEquals(B_YYMMorMMYY.exec("1000"), "MMYY");
    }

    @Test
    public void test3() {
        assertEquals(B_YYMMorMMYY.exec("0010"), "YYMM");
    }

    @Test
    public void test4() {
        assertEquals(B_YYMMorMMYY.exec("9999"), "NA");
    }

    @Test
    public void test5() {
        assertEquals(B_YYMMorMMYY.exec("9900"), "NA");
    }

    @Test
    public void test6() {
        assertEquals(B_YYMMorMMYY.exec("1905"), "YYMM");
    }

    @Test
    public void test7() {
        assertEquals(B_YYMMorMMYY.exec("0112"), "AMBIGUOUS");
    }

    @Test
    public void test8() {
        assertEquals(B_YYMMorMMYY.exec("1700"), "NA");
    }

}
