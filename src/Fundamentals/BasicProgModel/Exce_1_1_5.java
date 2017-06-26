package Fundamentals.BasicProgModel;

import Std.StdIn;
import Std.StdOut;

/**
 * 编写一段程序，如果double类型的变量x和y都严格位于0和1之间则打印true，否则打印false
 * <p>
 * double 小数点最多精确到15位
 * <p>
 * Created by dadisdad on 2017/6/26.
 */
public class Exce_1_1_5 {

    public static void main(String[] args) {
        double a = 0.0, b = 0.0;
        StdOut.println("please enter two double numbers:");
        a = StdIn.readDouble();
        b = StdIn.readDouble();
        if (compare(a) && compare(b)) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }

    public static boolean compare(double x) {
        if (x > 0.0 && x < 1.0) {
            return true;
        } else {
            return false;
        }
    }
}
