package main.bignner.contest122;

import org.junit.Test;

class C_GetACTest {

    @Test
    void test() {
        int N = 100000;
        int Q = 100000;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append("AC");
        }
        String S = sb.toString();

        int[][] query = new int[Q][2];
        for (int i = 0; i < Q; i++) {
            query[i][0] = 1;
            query[i][1] = 100000 - 1;
        }
        C_GetAC.solve(N, Q, S, query);
    }

}
