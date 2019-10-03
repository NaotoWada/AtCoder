package main.bignner.contest130;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        execute();
    }

    private static void execute() {

        Main m = new Main();

        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        int[] k = new int[M];
        String[] p = new String[M];
        List<SwitchBulb> swbList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String[] split = sc.nextLine().split(" ");

            if (i == M) {
                p = split;
                break;
            }

            k[i] = Integer.parseInt(split[0]);

            int paramLength = split.length;
            SwitchBulb swb = m.new SwitchBulb(i, paramLength);

            for (int j = 0; j < paramLength; j++) {
                if (j == 0) {
                    continue;
                }
                swb.addLine(j, split[j]);
            }
            swbList.add(swb);

        }

        System.out.println();
    }

    class SwitchBulb {
        public SwitchBulb(int i, int paramLength) {
            this.id = i;
            this.switchLines = new int[paramLength];
        }

        public void addLine(int j, String param) {
            this.switchLines[j] = Integer.parseInt(param);
        }

        int id;
        int[] switchLines;
    }
}
