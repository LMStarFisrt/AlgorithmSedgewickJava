package Fundamentals.BasicProgModel;

/**
 * 将正整数N转换为二进制，用字符串表示
 * Created by dadisdad on 2017/6/26.
 */
public class Exce_1_1_9 {

    public static String toBinaryString(int N){
        String s="";
        for (int n = N; n > 0; n/=2) {
            s = (n%2)+s;
        }
        return s;
    }

    public static void main(String[] args) {
        int a=1025;

        System.out.println(toBinaryString(a));
    }
}
