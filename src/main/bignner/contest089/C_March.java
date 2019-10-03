package main.bignner.contest089;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_March {

    static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("M", 0);
        map.put("A", 1);
        map.put("R", 2);
        map.put("C", 3);
        map.put("H", 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[] march = new int[5];
        for (int i = 0; i < N; i++) {
            String initial = String.valueOf(sc.next().charAt(0));
            if (map.containsKey(initial)) {
                march[map.get(initial)]++;
            }
        }

        int sum = Arrays.stream(march).sum();
        if (sum < 3) {
            System.out.println(0);
        } else {
            int diff = sum - 3;
            System.out.println(1 + diff * diff);
        }
    }
}
