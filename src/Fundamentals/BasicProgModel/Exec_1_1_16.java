package Fundamentals.BasicProgModel;

/**
 * Created by dadisdad on 2017/6/28.
 */
public class Exec_1_1_16 {

    public static String exR1(int n){
        if(n<=0) return "";
        return exR1(n-3)+n+exR1(n-2)+n;
    }

    public static void main(String[] args) {
        System.out.println(exR1(6));
    }
}