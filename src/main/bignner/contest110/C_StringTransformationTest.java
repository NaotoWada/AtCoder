package main.bignner.contest110;

import org.junit.Test;

public class C_StringTransformationTest {

    @Test
    public void test() {
        String s = null;
        String t = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200000; i++) {
            sb.append("a");
        }
        s = sb.toString();
        t = sb.toString();
        System.out.println(s);
        C_StringTransformation.solve(s, t);
    }

}
