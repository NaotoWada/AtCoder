package main.bignner.contest108;

public class B_RuinedSquare2 {

    public static void main(String[] args) {

        // ユークリッド距離の計算確認
        System.out.println(calcEuclid(31, -41, -59, 26));
        System.out.println(calcEuclid(6, 6, 3, 10));
        System.out.println(calcEuclid(2, 3, 3, 10));
        System.out.println(calcDiagonal(112));
    }

    private static double calcDiagonal(int d) {
        return Math.sqrt(2) * d;
    }

    static double calcEuclid(int x, int y, int x2, int y2) {
        int t = (int) (Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
        return Math.sqrt(t);
    }
}

