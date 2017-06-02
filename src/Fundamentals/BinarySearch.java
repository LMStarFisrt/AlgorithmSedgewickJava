package Fundamentals;

import Std.In;
import Std.StdIn;
import Std.StdOut;

import java.util.Arrays;

/**
 * 二分查找
 * Created by dadisdad on 2017/6/1.
 */
public class BinarySearch {

    public static int rank(int key, int a[]){
        int lo=0;
        int hi = a.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid]){
                hi=mid-1;
            }else if (key>a[mid]){
                lo=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList= In.readInts(args[0]);
        Arrays.sort(whiteList);
        for (int i : whiteList) {
			System.out.println(i);
		}
        while (!StdIn.isEmpty()){
            int key=StdIn.readInt();
            System.out.println("key:"+key);
            if(rank(key,whiteList)<0){
                StdOut.println(key);
            }
        }
    }
}
