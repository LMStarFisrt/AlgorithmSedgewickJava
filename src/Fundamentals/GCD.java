package Fundamentals;

import java.util.Scanner;

/**
 * 最大公约数算法
 * Created by dadisdad on 2017/5/8.
 */
public class GCD {

    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("求两个数的最大公约数");
        System.out.println("请输入第一个数：");
        int p=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int q=scanner.nextInt();
        System.out.println("最大公约数为："+gcd(p,q));

    }
}
