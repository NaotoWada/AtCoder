package main.bignner.contest132;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_FiftyFifty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<String> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(String.valueOf(c));
        }

        System.out.println(set.size() == 2 ? "Yes" : "No");
    }
}
