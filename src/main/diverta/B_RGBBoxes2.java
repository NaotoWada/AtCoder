package main.diverta;

import java.util.Scanner;

public class B_RGBBoxes2 {

    // nCmax(r,g,b)
    public static void main(String[] args) {// 6minAC

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int R = Integer.parseInt(abt[0]);
        int G = Integer.parseInt(abt[1]);
        int B = Integer.parseInt(abt[2]);
        int N = Integer.parseInt(abt[3]);

        int pattern = 0;
        for (int i = 0; i * R <= N; i++) {
            long x = i * R;
            for (int j = 0; x + j * G <= N; j++) {
                long y = j * G;
                if ((N - x - y) % B == 0) {
                    long z = (N - x - y) / B;
                    System.out.printf("R回[%s] G回[%s] B回[%s]\n", i, y, z);
                    pattern++;
                }

            }
        }
        System.out.println(pattern);
    }
}
