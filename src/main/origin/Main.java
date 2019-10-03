package main.origin;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inCnt = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < inCnt; i++) {
            set.add(sc.next());
        }
        merge(fix(sort(round(set)))).stream().forEach(System.out::println);
    }

    private static List<String> fix(List<String> sList) {
        int sz = sList.size();
        List<String> ret = new ArrayList<>();
        boolean isRecursive = false;
        for (int i = 0; i < sz; i++) {
            if (i == sz - 1) {
                ret.add(sList.get(i));
                break;
            }
            String befF = sList.get(i).split("-")[0];
            String befE = sList.get(i).split("-")[1];
            String aftF = sList.get(i + 1).split("-")[0];
            String aftE = sList.get(i + 1).split("-")[1];

            if (befE.equals(aftF)) {
                ret.add(befF + "-" + aftE);
                i++;
                isRecursive = true;
            } else if (befF.equals(aftF)) {
                ret.add(sList.get(i + 1));
                i++;
                isRecursive = true;
            } else {
                ret.add(sList.get(i));
            }
        }

        if (isRecursive) {
            return fix(ret);
        }
        return ret;
    }

    private static List<String> merge(List<String> sList) {
        int sz = sList.size();
        List<String> ret = new ArrayList<>();
        boolean isRecursive = false;
        for (int i = 0; i < sz; i++) {
            if (i == sz - 1) {
                ret.add(sList.get(i));
                break;
            }

            String befE = sList.get(i).split("-")[1];
            String aftF = sList.get(i + 1).split("-")[0];
            String aftE = sList.get(i + 1).split("-")[1];

            if (Integer.parseInt(befE) >= Integer.parseInt(aftE)) {
                // 前要素の終了が後要素の終了より大きいので前要素で上書き
                ret.add(sList.get(i));
                i++;
                isRecursive = true;
            } else if (Integer.parseInt(befE) >= Integer.parseInt(aftF)) {
                // 前要素の終了が、後要素の開始より大きいのでマージ
                ret.add(sList.get(i));
                i++;
                isRecursive = true;
            } else {
                ret.add(sList.get(i));
            }
        }
        if (isRecursive) {
            return merge(ret);
        }
        return ret;
    }

    private static List<String> sort(HashSet<String> rSet) {
        return rSet.stream().sorted().collect(Collectors.toList());
    }

    private static HashSet<String> round(HashSet<String> inSet) {
        HashSet<String> rounds = new HashSet<>();
        for (String notRound : inSet) {
            String rndS = roundStart(notRound.split("-")[0]);
            String rndE = roundEnd(notRound.split("-")[1]);
            rounds.add(rndS + "-" + rndE);
        }
        return rounds;
    }

    private static String roundStart(String notRound) {
        if (isNotNeedRound(notRound)) {
            return notRound;
        }
        if ((Integer.parseInt(notRound) % 10) > 5) {
            return round5(notRound);
        } else {
            return round0(notRound);
        }
    }

    private static String roundEnd(String notRound) {
        if (isNotNeedRound(notRound)) {
            return notRound;
        }
        if ((Integer.parseInt(notRound) % 10) > 5) {
            return roundUp(notRound);
        } else {
            return round5(notRound);
        }
    }

    private static boolean isNotNeedRound(String notRound) {
        return Integer.parseInt(notRound) % 5 == 0;
    }

    private static String round0(String nR) {
        return nR.substring(0, 3) + "0";
    }

    private static String round5(String nR) {
        return nR.substring(0, 3) + "5";
    }

    private static String roundUp(String nR) {
        LocalTime lt = LocalTime.of(getHour(nR), getMin(nR));
        lt = lt.plusMinutes(5);
        String h = addDigitIfDigitIs1(lt.getHour());
        String m = addDigitIfDigitIs1(lt.getMinute());

        // 分の単位は5を加算して繰り上げすると必ず0になる
        m = m.substring(0, 1) + "0";
        return h + m;
    }

    private static String addDigitIfDigitIs1(int lt) {
        if (lt < 10) {
            return "0" + String.valueOf(lt);
        } else {
            return String.valueOf(lt);
        }
    }

    private static int getMin(String nR) {
        return Integer.parseInt(nR.substring(2, 4));
    }

    private static int getHour(String nR) {
        return Integer.parseInt(nR.substring(0, 2));
    }
}
