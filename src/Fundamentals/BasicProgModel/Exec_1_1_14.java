package Fundamentals.BasicProgModel;

/**
 * 返回不大于log2^N的最大整数
 * Created by dadisdad on 2017/6/28.
 */
public class Exec_1_1_14 {

    public static void main(String[] args) {
        System.out.println(lg(16));
    }

    public static int lg(int N) {
        int a = 0;
        while (N >= 2) {
            N = N / 2;
            a++;
        }
        return a;
    }

}
