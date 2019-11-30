package main.lib;

import java.util.HashSet;
import java.util.Set;

public class Divisor {

    /**
     * 
     * @param n
     * @return
     */
    public static Set<Integer> divisor(int n) {
        Set<Integer> ret = new HashSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ret.add(i);
                if (i != n / i)
                    ret.add(n / i);
            }
        }
        return ret;
    }
}
