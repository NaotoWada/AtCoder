package main.bignner.contest108;

import static org.junit.Assert.*;
import org.junit.Test;

public class C_TriangularRelationshipTest {

    @Test
    public void test1() {
        // example1
        long actual = C_TriangularRelationship3.solve(3, 2);
        assertEquals(9, actual);
    }

    @Test
    public void test2() {
        // example2
        long actual = C_TriangularRelationship3.solve(5, 3);
        assertEquals(1, actual);
    }

    @Test
    public void test3() {
        // example3
        long actual = C_TriangularRelationship3.solve(31415, 9265);
        assertEquals(27, actual);
    }

    @Test
    public void test4() {
        // example4
        long actual = C_TriangularRelationship3.solve(35897, 932);
        assertEquals(114191, actual);
    }

    @Test
    public void test5() {
        // 最大値
        long actual = C_TriangularRelationship3.solve(200000, 1);
        assertEquals(114191, actual);
    }

}
