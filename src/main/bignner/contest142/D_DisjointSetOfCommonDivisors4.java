package main.bignner.contest142;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class D_DisjointSetOfCommonDivisors4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long ans = solve(a, b);
        System.out.println(ans);
    }

    static long solve(long a, long b) {

        // AとBの約数を全列挙
        Set<Long> al = divisor(a);
        Set<Long> bl = divisor(b);
        System.out.printf("size %s - %s \n", al.size(), bl.size());

        // ペアになってるものをリスト化する
        List<Long> gcdPair = new ArrayList<>();
        if (al.size() >= bl.size()) {
            for (Long bnum : bl) {
                if (al.contains(bnum)) {
                    gcdPair.add(bnum);
                }
            }
        } else {
            for (Long anum : al) {
                if (bl.contains(anum)) {
                    gcdPair.add(anum);
                }
            }
        }

        // 昇順ソート（別にしなくてもいい？）
        Collections.sort(gcdPair);

        // 素数かどうか判定
        long ans = 0;
        for (int i = 0; i < gcdPair.size(); i++) {
            long num = gcdPair.get(i);
            if (isPrime(num)) {
                ans++;
            }
        }
        return ans + 1;
    }

    static Set<Long> divisor(long n) {
        Set<Long> ret = new HashSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ret.add(i);
                if (i != n / i)
                    ret.add(n / i);
            }
        }
        return ret;
    }

    static boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }

        if (n < 2 || n % 2 == 0) {
            return false;
        }

        double sqrtNum = Math.sqrt(n);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
