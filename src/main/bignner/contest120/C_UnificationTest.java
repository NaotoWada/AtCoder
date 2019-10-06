package main.bignner.contest120;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_UnificationTest {

    @Test
    public void test() {
        // 前半が0、後半が1の場合が最大ケース。
        // これで十分高速ならTLEにならない
        String s = make(100000);
        int actual = C_Unification2.solve(s);
        assertEquals(100000, actual);
    }

    private String make(int i) {
        StringBuilder sb0 = new StringBuilder();
        for (int j = 0; j < i / 2; j++) {
            sb0.append("0");
        }
        StringBuilder sb1 = new StringBuilder();
        for (int j = 0; j < i / 2; j++) {
            sb1.append("1");
        }

        sb0.append(sb1.toString());
        return sb0.toString();
    }

}
