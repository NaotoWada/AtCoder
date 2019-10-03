package main.grand;

import java.util.Scanner;

public class A_DarkerAndDarker {

    private static int H = 0;
    private static int W = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] HW = sc.nextLine().split(" ");
        H = Integer.parseInt(HW[0]);
        W = Integer.parseInt(HW[1]);

        char[][] AHW = new char[H][W];
        for (int i = 0; i < H; i++) {
            String A = sc.nextLine();
            AHW[i] = A.toCharArray();
        }

        int times = 0;
        while (true) {
            if (isEnd(AHW)) {
                break;
            }
            times += fill(AHW);
        }
        System.out.println(times);
    }

    private static int fill(char[][] aHW) {

        boolean isFill = false;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {

                char c = aHW[i][j];
                if (c != '#') {
                    continue;
                }

                // 横方向
                if (j == 0) {
                    // 左端
                    char R = aHW[i][j + 1];
                    if (R == '.') {
                        aHW[i][j + 1] = '#';
                        isFill = true;
                    }

                } else if (j == W - 1) {
                    // 右端
                    char L = aHW[i][j - 1];
                    if (L == '.') {
                        aHW[i][j - 1] = '#';
                        isFill = true;
                    }

                } else {
                    // それ以外
                    char L = aHW[i][j - 1];
                    char R = aHW[i][j + 1];
                    if (L == '.' || R == '.') {
                        aHW[i][j - 1] = '#';
                        aHW[i][j + 1] = '#';
                        isFill = true;
                    }
                }
                // 縦方向
                if (i == 0) {
                    // 上端
                    char U = aHW[i + 1][j];
                    if (U == '.') {
                        aHW[i + 1][j] = '#';
                        isFill = true;
                    }
                } else if (i == H - 1) {
                    // 下端
                    char T = aHW[i - 1][j];
                    if (T == '.') {
                        aHW[i - 1][j] = '#';
                        isFill = true;
                    }
                } else {
                    // それ以外
                    char T = aHW[i - 1][j];
                    char U = aHW[i + 1][j];
                    if (T == '.' || U == '.') {
                        aHW[i - 1][j] = '#';
                        aHW[i + 1][j] = '#';
                        isFill = true;
                    }
                }
            }
        }

        if (isFill) {
            return 1;
        } else {
            return 0;
        }
    }

    private static boolean isEnd(char[][] aHW) {
        for (char[] cs : aHW) {
            for (char c : cs) {
                if (c == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
