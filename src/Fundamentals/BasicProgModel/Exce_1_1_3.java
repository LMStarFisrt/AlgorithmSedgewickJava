package Fundamentals.BasicProgModel;

import Std.StdIn;
import Std.StdOut;

import java.util.Scanner;

/**
 * 编写一个程序，从命令行中读取三个整数参数。如果它们都相等则打印 equal ，否则打印 not equal
 * <p>
 * Created by dadisdad on 2017/6/26.
 */
public class Exce_1_1_3 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        StdOut.println("please enter three numbers:");
        a = StdIn.readInt();
        b = StdIn.readInt();
        c = StdIn.readInt();

        if (equals(a, b, c)) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }

    public static boolean equals(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }

}
