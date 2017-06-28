package Fundamentals.BasicProgModel;

import Std.StdOut;
import Std.StdRandom;

/**
 * 二维数组的转置（交换行和列）
 * Created by dadisdad on 2017/6/27.
 */
public class Exec_1_1_13 {

    public static void main(String[] args) {
        int m=8;
        int n=7;
        int[][] a=new int[m][n];
        int[][] b=new int[n][m];
        System.out.println("初始化原始数组：");
        randomInit(a,10);
        printArray(a);
        System.out.println("转置数组为：");
        reverse(a,b);
        printArray(b);
    }

    public static int[][] reverse(int[][] a, int[][] b){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i]=a[i][j];
            }
        }
        return b;
    }

    public static int[][] randomInit(int[][] a,int N){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=StdRandom.uniform(N);
            }
        }
        return a;
    }

    public static void printArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                StdOut.print(a[i][j]+"    ");
            }
            StdOut.println();
        }
    }

}
