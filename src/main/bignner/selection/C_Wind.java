package main.bignner.selection;

import java.math.BigDecimal;
import java.util.Scanner;

public class C_Wind {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double degBd = calcDeg(sc.nextInt());
        double desBd = calcDes(sc.nextInt());

        int windP = getPower(desBd);

        if (windP == 0) {
            System.out.println("C 0");
            return;
        }

        System.out.println(getVector(degBd) + " " + windP);
    }


    private static double calcDeg(int deg) {
        return new BigDecimal(deg).divide(new BigDecimal(10)).doubleValue();
    }

    private static double calcDes(int des) {
        return new BigDecimal(des).divide(new BigDecimal(60), 1, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }

    private static int getPower(double d) {
        if (d <= 0.2) {
            return 0;
        } else if (d <= 1.5) {
            return 1;
        } else if (d <= 3.3) {
            return 2;
        } else if (d <= 5.4) {
            return 3;
        } else if (d <= 7.9) {
            return 4;
        } else if (d <= 10.7) {
            return 5;
        } else if (d <= 13.8) {
            return 6;
        } else if (d <= 17.1) {
            return 7;
        } else if (d <= 20.7) {
            return 8;
        } else if (d <= 24.4) {
            return 9;
        } else if (d <= 28.4) {
            return 10;
        } else if (d <= 32.6) {
            return 11;
        } else {
            return 12;
        }
    }

    private static String getVector(double degBd) {
        if (degBd < 11.25 && degBd > 348.75) {
            return "N";
        }

        int elmCnt = 0;
        for (double term = 33.75; term < 360; term += 22.5) {
            System.out.println(term);
            if (degBd < term) {
                break;
            }
            elmCnt++;
        }
        String[] vectorArr = new String[] { "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S", "SSW",
                "SW", "WSW", "W", "WNW", "NW", "NNW" };
        return vectorArr[elmCnt];
    }
}
