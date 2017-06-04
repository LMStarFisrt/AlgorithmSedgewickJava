package Fundamentals.BasicProgModel;

import Std.In;
import Std.StdIn;
import Std.StdOut;

import java.util.Arrays;

/**
 * 二分查找
 * Created by dadisdad on 2017/6/1.
 */
public class BinarySearch {

    public static int rank(int key, int a[]) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * <p>在Idea中，无法通过配置设置main函数的重定向参数，只能通过设置</p>
     * 
     * Program arguments: tinyW.txt tinyT.txt</b></p>
     * <p>路径是相对路径，也可是绝对路径</p>
     * <p>然后通过以下程序：</p>
     * <pre>
     * int[] keys = In.readInts(args[2]);
     * for (int key :keys) {
     *     if (rank(key, whiteList) < 0) {
     *	       StdOut.println(key);
     *	   }
     * }
     *</pre>
     *
     * <p>在eclipse中，可以通过配置设置main函数的重定向参数进行设置</p>
     * 
     * <p><b>Program arguments: tinyW.txt</b></p>
     * <p><b>common里的Input File：tinyT.txt (可通过eclipse选择)</b></p>
     * 
     */
    public static void main(String[] args) {
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if(rank(key,whiteList)<0){
                StdOut.println(key);
            }
        }
    }
}
