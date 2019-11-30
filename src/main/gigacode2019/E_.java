package main.gigacode2019;

import java.math.BigDecimal;
import java.util.Scanner;

public class E_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int vs = sc.nextInt();
        int ds = sc.nextInt();

        int[] x = new int[n];
        int[] v = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            v[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        double ans = 0.0;
        Car current = new Car(0, vs, ds);
        int carIndex = 0;
        int nextCarPoint = 0;
        if (n != 0) {
            nextCarPoint = x[carIndex];
        }
        for (int i = 0; i < l; i++) {
            if (i == nextCarPoint) {
                // 乗り換えのポイント

                if (carIndex + 1 < x.length) {
                    // 最後の車は乗り換えない

                    Car nextCar = new Car(carIndex, v[carIndex], d[carIndex]);

                    if (nextCar.speed > current.speed) {
                        // とりあえず早い方に乗り換え
//                        System.out.printf("moved %s -> %s \n", current, nextCar);

                        current = nextCar;

                        carIndex++;
                        nextCarPoint = x[carIndex];
                    }
                }
            }

            try {
                ans += current.drive();
            } catch (Exception e) {
                System.out.println("impossible");
                System.exit(0);
            }
        }

        if (n == 0) {
            BigDecimal bd = BigDecimal.valueOf((double) l / current.speed);
            System.out.println(bd.toPlainString());
        } else {
            System.out.println(ans);
        }
    }

    static class Car {
        int park;
        int speed;
        int fuel;

        public Car(int i, int vs, int ds) {
            this.park = i;
            this.speed = vs;
            this.fuel = ds;
        }

        public double drive() throws Exception {
            if (fuel == 0) {
                throw new Exception();
            }
            fuel--;
            return (double) 1 / speed;
        }

        @Override
        public String toString() {
            return this.speed + ":" + this.fuel;
        }
    }
}
