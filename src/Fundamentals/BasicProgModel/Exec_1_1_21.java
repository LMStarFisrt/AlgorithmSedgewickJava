package Fundamentals.BasicProgModel;

import Std.In;
import Std.StdIn;
import Std.StdOut;

/**
 * Created by dadisdad on 2017/7/5.
 */
public class Exec_1_1_21 {

    public static void main(String[] args) {
        String ss = StdIn.readLine();
        String[] a = ss.split(" ");
        double b = Double.parseDouble(a[1]);
        double c = Double.parseDouble(a[2]);
        double res = b / c;
        StdOut.printf("%s %s %s %10.3f", a[0], a[1], a[2], res);
    }
}
