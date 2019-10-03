package main.bignner.contest089;

import org.junit.Test;

public class C_March4Test {

    @Test
    public void test() {

        int[] march = new int[5];

        march[0] = 20000;
        march[1] = 20000;
        march[2] = 20000;
        march[3] = 20000;
        march[4] = 20000;

        long actual = C_March4.solve(100000, march);
        System.out.println(actual);
    }

}
