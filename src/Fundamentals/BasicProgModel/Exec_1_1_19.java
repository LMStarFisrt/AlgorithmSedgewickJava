package Fundamentals.BasicProgModel;

import Std.StdOut;

import java.math.BigInteger;
import java.util.Timer;

/**
 * Created by dadisdad on 2017/6/28.
 */
public class Exec_1_1_19 {

    public static long F(int N){
        if(N==0) return 0;
        if(N==1) return 1;
        return F(N-1)+F(N-2);
    }

    public static BigInteger[] A(int N){
        BigInteger[] a=new BigInteger[N];
        a[0]=new BigInteger("0");
        a[1]=new BigInteger("1");
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i-1].add(a[i-2]);
            StdOut.println(i+":"+a[i]);
        }
        return a;
    }

    public static void main(String[] args) {
        A(100);
        /*for (int N=0;N<100;N++){
            StdOut.println(N+" "+F(N));
        }*/
    }

}
