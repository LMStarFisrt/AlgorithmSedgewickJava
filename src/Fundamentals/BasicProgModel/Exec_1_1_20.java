package Fundamentals.BasicProgModel;

/**
 * 递归计算ln(N!)的值
 * Created by dadisdad on 2017/7/4.
 */
public class Exec_1_1_20 {

    public static double ln(int N){
        if(N==1){
            return 0;
        }else {
            return Math.log(N) + ln(N - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }

}
