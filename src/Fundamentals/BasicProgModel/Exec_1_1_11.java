package Fundamentals.BasicProgModel;

import Std.StdOut;
import Std.StdRandom;

/**
 * 打印二位布尔数组
 * Created by dadisdad on 2017/6/27.
 */
public class Exec_1_1_11 {

    public static void main(String[] args) {
        boolean[][] a = new boolean[4][4];
        a = randomInit(a);
        printBool(a);
    }

    public static void printBool(boolean[][] a) {
        for (int j = 0; j < a.length + 1; j++) {
            StdOut.println();
            StdOut.print(j + "  ");
            if (j == 0) {
                for (int i = 0; i < a[j].length; i++) {
                    StdOut.print((i + 1) + "       ");
                }
            } else {
                for (int k = 0; k < a[j - 1].length; k++) {
                    if (a[j - 1][k]) {
                        StdOut.print("true" + "  ");
                    } else {
                        StdOut.print("false" + "  ");
                    }
                }
            }
        }
    }

    public static boolean[][] randomInit(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (StdRandom.bernoulli(0.1)) {
                    a[i][j] = true;
                } else {
                    a[i][j] = false;
                }
            }
        }
        return a;
    }
}
