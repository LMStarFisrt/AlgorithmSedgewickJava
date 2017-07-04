package Fundamentals.BasicProgModel;

import Std.StdOut;
import Std.StdRandom;

/**
 * 接收一个整型数组a[]和一个整数M为参数病返回一个大小为M的数组，
 * 其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length相等
 * Created by dadisdad on 2017/6/28.
 */
public class Exec_1_1_15 {

    public static int[] histogram(int[] a, int M) {
        int[] m = new int[M];
        for (int i = 0; i < M; i++) {
            int n = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    n++;
                }
            }
            m[i] = n;
        }
        return m;
    }

    public static int[] randomInit(int[] a, int N) {
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(N);
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + "    ");
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        int[] a=new int[10];
        System.out.println("初始化a[]数组：");
        randomInit(a,10);
        printArray(a);
        System.out.println("返回数组为：");
        int[] m = histogram(a,10);
        printArray(m);
    }

}
